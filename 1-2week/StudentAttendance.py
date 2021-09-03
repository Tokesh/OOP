from datetime import datetime

#Все перевести в Java, желательно оптимизировать по последнему имени.
#Java info - arrays, files, datatime, dictionaries

students_minutes={}

f = open('input.txt','r')
attendance_massive = f.read().split('\n')
devide = []


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
                if(devide[i][0] not in students_minutes):
                    students_minutes[devide[i][0]]=minutesdif//60
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