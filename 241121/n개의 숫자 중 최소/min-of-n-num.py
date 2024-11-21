N = int(input())
N_list = list(map(int,input().split()))

min_val = N_list[0]
min_count = 1

for i in N_list:
    if i < min_val:
        min_val=i
        min_count += 1

print(f'{min_val} {min_count}')