N = int(input())  
numbers = [int(input()) for _ in range(N)] 

for number in numbers:
    if number % 2 == 1 and number % 3 == 0:
        print(number)