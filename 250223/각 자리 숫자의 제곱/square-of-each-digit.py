def suq_num(N):
    if N < 10:
        return N*N
    return suq_num(N//10) + (N % 10)*(N % 10)

N = int(input())


print(suq_num(N))