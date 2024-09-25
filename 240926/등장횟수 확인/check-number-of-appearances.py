numbers = [int(input()) for _ in range(5)]
even_cnt = 0
for number in numbers:
    if number % 2 == 0:  
        even_cnt += 1  
print(even_cnt)