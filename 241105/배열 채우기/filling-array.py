num = list(map(int, input().split()))
count = 0

for i in num:
    if i == 0:
        break
    count += 1

for i in range(count - 1, -1, -1):
	print(num[i], end=" ")