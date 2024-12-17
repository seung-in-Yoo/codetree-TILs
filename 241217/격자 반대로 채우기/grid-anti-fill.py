n = int(input())

A = [[0] * n for _ in range(n)]
x = 1

for j in range(n):
    for i in range(n):
        A[i if j&1 else n-i-1][j] = x
        x += 1

for i in range(n):
    print(*A[i][::-1])