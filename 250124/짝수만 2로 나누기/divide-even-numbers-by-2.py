def fun(arr):
    for i in range(len(arr)):
        if arr[i] % 2 == 0:
            arr[i] //= 2  

N = int(input())
arr = list(map(int, input().split()))

fun(arr)  
print(*arr)  
