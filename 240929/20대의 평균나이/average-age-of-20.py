total_age = 0
count = 0

while True:
    age = int(input())  
    
    if age >= 30 or age < 20:
        break

    total_age += age  
    count += 1  

avg = total_age / count
print(f'{avg:.2f}')