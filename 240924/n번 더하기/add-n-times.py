inp = input()
arr = inp.split()
a = int(arr[0])
n = int(arr[1])
i=1
for i in range(1,n+1):
    print(a+(n*i))