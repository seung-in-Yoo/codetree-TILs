inp = input()
arr = inp.split()
a = int(arr[0])
b = int(arr[1])
sum = 0
for i in range(a,b+1):
    if i%2==0:
        sum+=i
print(sum)