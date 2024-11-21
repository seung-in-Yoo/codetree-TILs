num = list(map(int,input().split()))

max_val = num[0]

for i in num:
    if i > max_val:
        max_val = i

print(max_val)
