a = int(input())
b = int(input())
c = int(input())

if(a==b==c):
    print('Equilateral')
elif(a+b+c == 180 and ((a==b) or (b==c) or(a==c))):
    print('Isosceles')
elif(a+b+c ==180):
    print('Scalene')
else:
    print('Error')
