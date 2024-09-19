inp=input()
arr = inp.split()
a = int(arr[0])
b = int(arr[1])
c = int(arr[2])

if (b<a<c) or (c<a<b):
    print(a)
elif (a<b<c) or (c<b<a):
    print(b)
else:
    print(c)