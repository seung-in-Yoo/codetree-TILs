def is_prime(num):
    if num < 2:  
        return False
    for i in range(2, int(num**0.5) + 1): 
        if num % i == 0:
            return False
    return True

def total_prime(a, b):
    total = 0  
    for i in range(a, b + 1):  
        if is_prime(i):  
            total += i
    return total

a, b = map(int, input().split())

print(total_prime(a, b))

