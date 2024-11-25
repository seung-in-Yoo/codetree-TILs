N = int(input())  
N_list = list(map(int, input().split()))  

result = []

while len(N_list) > 0:
    max_value = max(N_list)
    max_index = N_list.index(max_value)  
    result.append(max_index + 1)  
    N_list = N_list[:max_index]


print(" ".join(map(str, result)))
