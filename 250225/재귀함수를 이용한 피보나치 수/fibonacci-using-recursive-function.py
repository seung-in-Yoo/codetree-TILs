def fibo(N):
    if N == 1 or N == 2:
        return 1 

    return fibo(N - 1) + fibo(N - 2)

N = int(input())

print(fibo(N))
