n = list(map(int, input().split()))

count_arr = [0] * 6

for i in n:
    count_arr[i - 1] += 1


for idx, count in enumerate(count_arr, start=1):  
    print(f'{idx} - {count}')
