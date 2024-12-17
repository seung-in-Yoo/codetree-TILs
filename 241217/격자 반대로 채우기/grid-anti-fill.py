n = int(input())
mat = [[0] * n for _ in range(n)]

first = 1
for col in range(n - 1, -1, -1):  
    if col % 2 == 0:  
        for row in range(n):
            mat[row][col] = first
            first += 1
    else:  
        for row in range(n - 1, -1, -1):
            mat[row][col] = first
            first += 1

for row in mat:
    print(" ".join(map(str, row)))

