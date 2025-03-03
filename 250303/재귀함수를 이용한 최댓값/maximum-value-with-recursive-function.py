def find_max(arr, n):
    if n == 1:
        return arr[0]
    
    max_num = find_max(arr, n - 1)
    return max(arr[n - 1], max_num)

n = int(input())
arr = list(map(int, input().split()))

print(find_max(arr, n))
