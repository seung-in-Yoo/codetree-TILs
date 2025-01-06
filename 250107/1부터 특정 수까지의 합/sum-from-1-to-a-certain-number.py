def div(N):
    count = 0
    for i in range(1, N + 1):  
        count += i
    goal = count // 10  
    return goal

N = int(input())
print(div(N))  