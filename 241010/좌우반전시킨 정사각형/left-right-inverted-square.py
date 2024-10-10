n = int(input())  

for i in range(n):
    for j in range(n-1, -1, -1): 
        print((i+1) * (j+1), end=" ")
    print()