n = list(map(int, input().split()))

arr = [0] * 10

for i in n:
    if i == 0:
        break
    if i >= 10:
        digit = i // 10
        arr[digit] += 1

for digit in range(1,10):
    print(f'{digit} - {arr[digit]}')


