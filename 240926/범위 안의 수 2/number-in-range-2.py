numbers = [int(input()) for _ in range(10)]
sum = 0
cnt = 0
for number in numbers:
    if 0<=number<=200:
        sum += number
        cnt += 1
avg = sum/cnt
print(f'{sum} {avg:.1f}')