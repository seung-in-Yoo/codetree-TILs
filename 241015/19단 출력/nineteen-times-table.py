for i in range(1, 20):
    for j in range(1, 20, 2): 
        if j + 1 <= 19:  
            print(f'{i} * {j} = {i*j} / {i} * {j+1} = {i*(j+1)}')
        else:  
            print(f'{i} * {j} = {i*j}')