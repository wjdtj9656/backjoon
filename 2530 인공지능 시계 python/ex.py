time = list(map(int,input().split()))
needTime = int(input())

time[2] += needTime

if time[2] >= 60:
    time[1] += time[2]//60
    time[2] = time[2]%60

if time[1] >=60:
    time[0] += time[1]//60
    time[1] = time[1]%60
if time[0] >= 24:
    time[0] = time[0]%24

print(f'{time[0]} {time[1]} {time[2]}')
