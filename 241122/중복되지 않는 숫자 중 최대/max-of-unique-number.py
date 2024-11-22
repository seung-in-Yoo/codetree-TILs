N = int(input())  
numbers = list(map(int, input().split()))  

no_numbers = []
for num in numbers:
    if numbers.count(num) == 1:  
        no_numbers.append(num)

if no_numbers:
    print(max(no_numbers)) 
else:
    print(-1)  
