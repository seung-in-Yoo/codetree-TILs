def plus_fun(N):
    if N == 1:  
        return 1
    return plus_fun(N - 1) + N  

N = int(input())

print(plus_fun(N))
