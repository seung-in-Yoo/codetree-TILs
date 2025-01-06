def least_mul(n, m):
    large = max(n, m)  
    while True:
        if large % n == 0 and large % m == 0:  
            print(large)
            break
        large += 1  

n, m = map(int, input().split())
least_mul(n, m)



