n = int(input())
mat = [[0] * n for _ in range(n)]

for i in range(n):
    mat[i][0] = 1
    mat[0][i] = 1

for i in range(1,n):
    for j in range(1,n):
        mat[i][j] = mat[i-1][j] + mat[i][j-1] + mat[i-1][j-1]

for row in mat:
    print(" ".join(map(str, row)))