import csv
from datetime import datetime

devide = []
last_name=[]
students_minutes={}
fmt = '%m/%d/%Y, %H:%M:%S %p'

with open('meetingAttendanceList.csv') as csv_file:
    csv_reader = csv.reader(csv_file, delimiter = ';')
    for row in csv_reader:
        name = row[0]
        status = row[1]
        timezxc = row[2]
        devide.append([name,status,timezxc])


for i in range(0,len(devide)):
    if(devide[i][1]=='Joined'):
        for j in range(i,len(devide)):
            if(devide[j][1]=='Left' and devide[i][0] == devide[j][0]):

                d1 = datetime.strptime(devide[i][2], fmt)
                d2 = datetime.strptime(devide[j][2], fmt)
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
    
for i in students_minutes:
    print(i,"was on lesson", students_minutes[i], "minutes")

