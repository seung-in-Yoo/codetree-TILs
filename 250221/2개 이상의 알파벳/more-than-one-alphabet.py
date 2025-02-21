def has_dup(s):
    not_dup = set(s)  
    if len(not_dup) >= 2:
        print("Yes")
    else:
        print("No")


A = input().strip()  
has_dup(A) 

