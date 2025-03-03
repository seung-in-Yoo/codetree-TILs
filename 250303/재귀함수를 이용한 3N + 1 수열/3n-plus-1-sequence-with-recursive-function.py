def sequence(N, count=0):
    if N == 1:
        return count
    
    if N % 2 == 0:
        return sequence(N // 2, count + 1)
    else:
        return sequence(N * 3 + 1, count + 1)

N = int(input())

print(sequence(N))
