mat = [[0] * 5 for _ in range(5)]

for i in range(5):
    mat[0][i] = 1  
    mat[i][0] = 1  

for i in range(1, 5):  
    for j in range(1, 5):  
        mat[i][j] = mat[i-1][j] + mat[i][j-1]  

for row in mat:
    print(" ".join(map(str, row)))

