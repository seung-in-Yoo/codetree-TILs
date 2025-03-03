def odd_even_sum(N):
    if N <= 0:
        return 0
    
    if N % 2 == 1:
        return N + odd_even_sum(N - 2)
    
    else:
        return N + odd_even_sum(N - 2)

N = int(input())

print(odd_even_sum(N))
