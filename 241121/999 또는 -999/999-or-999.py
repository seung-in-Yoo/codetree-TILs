nums = list(map(int,input().split()))


nums_filter = [num for num in nums if num != 999 and num != -999]

max_val = max(nums_filter)
min_val = min(nums_filter)


print(max_val, min_val)
