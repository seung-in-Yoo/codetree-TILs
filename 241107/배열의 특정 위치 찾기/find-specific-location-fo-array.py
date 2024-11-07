nums = list(map(int, input().split()))
n = len(nums)
even_sum = 0
three_sum = 0
nums_avg = 0
count = 0

for num in range(1,n,2):
    even_sum += nums[num]

for num in range(2,n,3):
    three_sum += nums[num]
    count += 1
    
nums_avg = three_sum/count

print(f'{even_sum} {nums_avg:.1f}')