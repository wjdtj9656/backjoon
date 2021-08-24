sum = 0
minNum = 100
for e in range(7):
    temp = int(input())
    if temp %2 == 1:
        sum += temp
        minNum = min(minNum,temp)

if sum == 0:
    sum = -1
    print(sum)
else:    
    print(sum)
    print(minNum)
