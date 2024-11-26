matrix = [input().split() for _ in range(5)]

result = []  
for row in matrix:
    new_row = []
    for char in row:
        new_row.append(chr(ord(char) - 32))  
    result.append(new_row)

for row in result:
    print(" ".join(row))
