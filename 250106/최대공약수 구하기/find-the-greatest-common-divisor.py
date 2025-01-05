def factor(n, m):
    goal = 1  
    for i in range(1, min(n, m) + 1):
        if n % i == 0 and m % i == 0:  
            goal = i  
    print(goal)  

n, m = map(int, input().split())
factor(n, m)