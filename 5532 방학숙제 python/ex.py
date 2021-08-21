
L = []
for _ in range(5):
    L.append(int(input()))
if L[1]%L[3]==0:
    temp1 = L[1]//L[3]
else:
    temp1 = L[1]//L[3]+1

if L[2]%L[4] == 0:
    temp2 = L[2]//L[4]
else:
    temp2 = L[2]//L[4]+1
max = max(temp1, temp2)
print(f'{L[0]-max}')
