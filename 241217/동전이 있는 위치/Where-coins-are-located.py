n, m = map(int, input().split())  
mat = [[0] * n for _ in range(n)]

for _ in range(m):
    r, c = map(int, input().split())
    mat[r-1][c-1] = 1  

for row in mat:
    print(" ".join(map(str, row)))
