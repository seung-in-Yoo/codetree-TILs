arr = list(map(int, input().split()))
arr_sum = 0
count = 0
for i in arr:
    if i >= 250:
        break
    arr_sum += i
    count += 1
arr_avg = arr_sum/count
    
print(f'{arr_sum} {arr_avg:.1f}')