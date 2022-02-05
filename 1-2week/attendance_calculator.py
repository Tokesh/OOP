import csv,os,sys
from datetime import datetime

if getattr(sys, 'frozen', False):
    application_path = os.path.dirname(sys.executable)
elif __file__:
    application_path = os.path.dirname(__file__)

devide = []
last_name=[]
students_minutes={}
fmt = '%m/%d/%Y, %H:%M:%S %p'
cwd = os.getcwd()
#print(cwd)
#print("Look", cwd)
#get files in directory
#files = os.listdir(cwd) 
#rint(files)
with open(os.path.join(application_path, "meetingAttendanceList.csv")) as csv_file:
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
                print(devide[i][0], minutesdif//60)
                if(devide[i][0] not in students_minutes): students_minutes[devide[i][0]] = 0
                students_minutes[devide[i][0]] += minutesdif//60
                break
                """ if(len(last_name) ==0):
                    students_minutes[devide[i][0]]=minutesdif//60
                    last_name.append(devide[i][0])    

                
                if(len(last_name) !=0 and devide[i][0] != last_name[-1]):
                    students_minutes[devide[i][0]]=minutesdif//60
                    last_name.append(devide[i][0])
                else:
                    students_minutes[devide[i][0]]+=minutesdif//60
                break """
    
print(students_minutes)
# rr = open("result_of_calculation.txt", "w")
# for i in students_minutes:
#     rr.write(str(i))
#     rr.write(" was on lesson")
#     rr.write(' ')
#     rr.write(str(students_minutes[i]))
#     rr.write(" minutes\n")
# rr.close()
kk = os.path.join(application_path, "result_of_calculation.txt")
rr = open(kk, "w")
for i in students_minutes:
    rr.write(str(i))
    rr.write(" was on lesson")
    rr.write(' ')
    rr.write(str(students_minutes[i]))
    rr.write(" minutes\n")
rr.close()
    
