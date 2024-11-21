n1,n2 = map(int,input().split())
A = list(map(int,input().split()))
B = list(map(int,input().split()))

found = False
for i in range(n1 - n2 + 1):  
    if A[i:i + n2] == B:  
        found = True
        break

if found:
    print("Yes")
else:
    print("No")