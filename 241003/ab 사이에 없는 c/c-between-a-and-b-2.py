inp = input()
arr = inp.split()
a = int(arr[0])
b = int(arr[1])
c = int(arr[2])
satisfied = False
for i in range(a,b+1):
    if i%c==0:
        satisfied=True
        break

if satisfied == True:
    print("NO")
else:
    print("YES")