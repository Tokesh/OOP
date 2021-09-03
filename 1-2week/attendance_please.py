from datetime import datetime
import csv

devide = []
last_name=[]


with open('meetingAttendanceList.csv') as csv_file:
    csv_reader = csv.reader(csv_file, delimiter = ';')
    for row in csv_reader:
        name = row[0]
        status = row[1]
        timezxc = row[2]
        devide.append([name,status,timezxc])
students_minutes={}
f = open('input.txt','r')
attendance_massive = f.read().split('\n')



for i in range(0,len(attendance_massive)):
    devide.append(attendance_massive[i].split(','))


fmt = '%H:%M:%S %p'


for i in range(0,len(attendance_massive)):
    if(devide[i][1]=='joined'):
        for j in range(i,len(attendance_massive)):
            if(devide[j][1]=='left' and devide[i][0] == devide[j][0]):

                d1 = datetime.strptime(devide[i][3], fmt)
                d2 = datetime.strptime(devide[j][3], fmt)
                minutesdif = (d2-d1).seconds


                if(len(last_name) ==0):
                    students_minutes[devide[i][0]]=minutesdif//60
                    last_name.append(devide[i][0])    

                
                if(len(last_name) !=0 and devide[i][0] != last_name[-1]):
                    students_minutes[devide[i][0]]=minutesdif//60
                    last_name.append(devide[i][0])
                else:
                    students_minutes[devide[i][0]]+=minutesdif//60
                break
    

            
print(students_minutes)













""" 
fmt = '%m/%d/%Y,%H:%M:%S %p'
d1 = datetime.strptime('9/1/2021,9:01:05 AM', fmt)
d2 = datetime.strptime('9/1/2021,9:02:05 AM', fmt)
minutesdif = (d2-d1).seconds
print(int(minutesdif/60)) """