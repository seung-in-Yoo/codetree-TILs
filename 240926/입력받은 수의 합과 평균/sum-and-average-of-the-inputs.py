n = int(input())
numbers = [int(input()) for _ in range(n)]

sum = 0
cnt = 0

for number in numbers:
    sum += number
    cnt += 1
avg = sum/cnt
print(f'{sum} {avg:.1f}')