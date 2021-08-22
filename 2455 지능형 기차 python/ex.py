nums = []
people = 0

for _ in range(4):
    outNum,inNum = map(int,input().split())
    people += inNum
    people -= outNum

    nums.append(people)

print(max(nums))
