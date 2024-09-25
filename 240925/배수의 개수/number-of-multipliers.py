numbers = [int(input()) for _ in range(10)]
cnt1 = 0
cnt2 = 0
for number in numbers:
    if number % 3 == 0:  
        cnt1 += 1
    if number % 5 == 0:
        cnt2 += 1
print(cnt1, cnt2)