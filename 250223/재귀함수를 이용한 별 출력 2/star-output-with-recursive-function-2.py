def recur_star(n):
    print(("* " * n).strip()) 

    if n == 1:  
        print("*")  
        return

    recur_star(n - 1)  

    print(("* " * n).strip())  

N = int(input())

recur_star(N)
