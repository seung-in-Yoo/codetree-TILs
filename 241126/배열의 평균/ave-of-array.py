matrix = []
for _ in range(2):  
    row = list(map(int, input().split()))  
    matrix.append(row)

row1_avg = sum(matrix[0]) / 4
row2_avg = sum(matrix[1]) / 4

col1_avg = (matrix[0][0] + matrix[1][0]) / 2
col2_avg = (matrix[0][1] + matrix[1][1]) / 2
col3_avg = (matrix[0][2] + matrix[1][2]) / 2
col4_avg = (matrix[0][3] + matrix[1][3]) / 2

total_sum = sum(matrix[0]) + sum(matrix[1])
total_avg = total_sum / 8

print(f"{row1_avg:.1f} {row2_avg:.1f}")
print(f"{col1_avg:.1f} {col2_avg:.1f} {col3_avg:.1f} {col4_avg:.1f}")
print(f"{total_avg:.1f}")
