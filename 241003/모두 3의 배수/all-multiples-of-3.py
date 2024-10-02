numbers = [int(input()) for _ in range(5)]  
satisfied = True  

for number in numbers:
    if number % 3 != 0:  
        satisfied = False
        break

if satisfied == True:
    print(1)  
else:
    print(0)