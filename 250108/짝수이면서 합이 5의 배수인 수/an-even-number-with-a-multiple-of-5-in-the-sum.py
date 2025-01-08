def total_num(n):
    if n % 2 != 0:
        return "No"

    digit_sum = (n // 10) + (n % 10)

    if digit_sum % 5 == 0:
        return "Yes"
    else:
        return "No"

n = int(input())

print(total_num(n))