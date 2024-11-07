n = int(input()) 
nums = list(map(int, input().split()))  

result = []
for num in nums[::-1]:  
    if num % 2 == 0:  
        result.append(num)

for num in result:
    print(num, end=" ")