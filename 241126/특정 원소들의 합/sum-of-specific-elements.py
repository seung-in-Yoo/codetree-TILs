matrix = [list(map(int,input().split())) for _ in range(4)]

matrix_sum = matrix[0][0] + matrix[1][0] + matrix[1][1] + matrix[2][0] + matrix[2][1] + matrix[2][2] + matrix[3][0] + matrix[3][1] + matrix[3][2] + matrix[3][3] 

print(matrix_sum)