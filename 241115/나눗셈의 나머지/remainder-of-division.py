a, b = map(int, input().split())

count_list = [0] * b


while a > 1:
    remain = a % b  
    count_list[remain] += 1  
    a //= b  

result = sum(count ** 2 for count in count_list)

print(result)
