num = list(map(int, input().split()))

count_mul2 = 0
sum_mul2 = 0

for i in num:
    if i == 0:
        break
    if i % 2 == 0:
        count_mul2 += 1
        sum_mul2 += i
print(f'{count_mul2} {sum_mul2}')