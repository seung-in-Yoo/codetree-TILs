numbers = list(map(int,input().split()))


max_num = 1
min_num = 1000

for i in numbers:
    if i < 500 and i > max_num:
        max_num = i 
    
    if i > 500 and i < min_num:
        min_num = i


print(f'{max_num} {min_num}')