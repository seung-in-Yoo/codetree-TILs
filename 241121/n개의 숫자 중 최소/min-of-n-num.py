N = int(input())
N_list = list(map(int,input().split()))

min_val = min(N_list)  
min_count = N_list.count(min_val) 

print(f'{min_val} {min_count}')