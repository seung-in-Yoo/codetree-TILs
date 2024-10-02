n = int(input())
satisfied = False
for i in range(1,n):
    if n % i != 0:
        satisfied = True
        break
if satisfied == True:
    print("P")
else:
    print("C")