def recur_fun(n):
    print(n, end=' ')  

    if n == 1:  
        print(n, end=' ')  
        return

    recur_fun(n - 1)  

    print(n, end=' ')  

N = int(input())

recur_fun(N)


