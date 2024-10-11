n = int(input())
cnt = 10

for i in range(n):
    for j in range(n):
        cnt -= 1
        if cnt == 0:
            cnt = 9
        print(cnt, end="")
    print()