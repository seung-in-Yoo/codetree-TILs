n = int(input())  
arr = list(map(int, input().split()))  

def fun_abs(arr):  
    for i in range(len(arr)):
        arr[i] = abs(arr[i])  

fun_abs(arr) 
print(*arr)  
