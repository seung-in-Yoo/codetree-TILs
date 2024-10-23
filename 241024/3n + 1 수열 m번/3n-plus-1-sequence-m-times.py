m = int(input())
n = int(input())
count = 0 

while True:
    if n % 2 == 0:
        count += 1
        n= n / 2
    elif n % 2 == 1:
        count += 1
        n = n*3 + 1
    if n==1:
        break

print(count)