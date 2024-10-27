inp = input()
arr = inp.split()
start, end = int(arr[0]), int(arr[1])

answer = 0
for num in range(start, end + 1):
    cnt = 0
    for i in range(1, num + 1):
        if num % i == 0:
            cnt += 1
    if cnt == 3:
        answer += 1

print(answer)