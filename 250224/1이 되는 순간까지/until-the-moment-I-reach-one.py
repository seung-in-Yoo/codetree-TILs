def div_fun_1(N, count=0):
    if N == 1:
        return count  
    
    if N % 2 == 0:
        return div_fun_1(N // 2, count + 1) 
    else:
        return div_fun_1(N // 3, count + 1) 

N = int(input())

print(div_fun_1(N))
