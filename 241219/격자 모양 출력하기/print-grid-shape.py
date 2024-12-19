n,m = map(int,input().split())
mat = [[0] * n for _ in range(n)]

for i in range(1,m+1):
    r,c = map(int,input().split())
    mat[r-1][c-1] = r*c

for row in mat:
    print(" ".join(map(str, row)))
