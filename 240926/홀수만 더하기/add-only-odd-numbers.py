n = int(input())  
numbers = [int(input()) for _ in range(n)]  

sum = 0  

for number in numbers:
    if number % 2 == 1 and number % 3 == 0: 
        sum += number 

print(sum)