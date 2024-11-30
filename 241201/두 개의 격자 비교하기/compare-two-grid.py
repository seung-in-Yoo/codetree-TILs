n,m = list(map(int,input().split()))

m1 = [list(map(int,input().split())) for _ in range(n)]
m2 = [list(map(int, input().split())) for _ in range(n)]

result = [[0 for _ in range(m)] for _ in range(n)]

for i in range(n):
    for j in range(m):
        if m1[i][j] == m2[i][j]:
            result[i][j] = 0
        else:
            result[i][j] = 1

for row in result:
    print(" ".join(map(str, row)))