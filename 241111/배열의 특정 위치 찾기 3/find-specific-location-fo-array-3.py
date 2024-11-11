n = list(map(int, input().split()))
n_num = 0

for i in range(len(n)):
    if n[i] == 0: 
        n_num = n[i-3] + n[i-2] + n[i-1]  
        break  

print(n_num)