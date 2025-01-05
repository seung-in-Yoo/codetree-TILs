def rectangle(N):
    count = 0  
    for i in range(N):
        row = []  
        for j in range(N):
            count += 1
            if count > 9:
                count = 1
            row.append(str(count))  
        print(" ".join(row))  

N = int(input())
rectangle(N)