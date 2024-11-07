nums = list(map(int, input().split()))
nums_sum = 0
nums_avg = 0
count = 0

for num in nums:
    if num == 0:
        break
    else:
        nums_sum += num
        count += 1
        nums_avg = nums_sum/count

print(f'{nums_sum} {nums_avg:.1f}')