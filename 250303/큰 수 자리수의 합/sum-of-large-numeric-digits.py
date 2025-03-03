def sum_of_digits_recursive(num):
    if num < 10:
        return num
    return num % 10 + sum_of_digits_recursive(num // 10)

def mul_and_plus_threenum(a, b, c):
    product = a * b * c
    return sum_of_digits_recursive(product)

a, b, c = map(int, input().split())

print(mul_and_plus_threenum(a, b, c))
