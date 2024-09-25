numbers = [int(input()) for _ in range(10)]
cnt = 0
for number in numbers:
    if number % 2 == 1:
        cnt += 1
print(cnt)