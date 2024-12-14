n, m = map(int, input().split())  
mat = [[0] * m for _ in range(n)] 
value = 1  

for i in range(n + m - 1):  
    if i < m:  
        x, y = 0, i
    else:  
        x, y = i - m + 1, m - 1
    
    while x < n and y >= 0:
        mat[x][y] = value
        value += 1
        x += 1
        y -= 1

for row in mat:
    print(" ".join(map(str, row)))
