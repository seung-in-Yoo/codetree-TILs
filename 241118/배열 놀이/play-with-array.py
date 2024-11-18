n, q = map(int, input().split())  
lists = list(map(int, input().split()))  

for _ in range(q):
    q_input = input().split()  
    if q_input[0] == "1":  
        a = int(q_input[1])
        print(lists[a - 1])
    elif q_input[0] == "2":  
        b = int(q_input[1])
        if b in lists:
            print(lists.index(b) + 1)  
        else:
            print(0)  
    elif q_input[0] == "3":  
        s, e = map(int, q_input[1:])
        print(" ".join(map(str, lists[s - 1:e])))
