inp = input()
arr = inp.split()
a = int(arr[0])
b = int(arr[1])
sum=0
if a>b:
    for i in range(b,a+1):
        if i%5==0:
            sum+=i
elif b>a:
    for i in range(a,b+1):
        if i%5==0:
            sum+=i
print(sum)