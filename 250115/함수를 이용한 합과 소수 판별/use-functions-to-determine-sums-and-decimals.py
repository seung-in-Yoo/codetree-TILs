def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def sum_even(n):
    return sum(int(digit) for digit in str(n)) % 2 == 0

def count_num(a, b):
    count = 0
    for i in range(a, b + 1):
        if is_prime(i) and sum_even(i):
            count += 1
    return count

a, b = map(int, input().split())
print(count_num(a, b))
