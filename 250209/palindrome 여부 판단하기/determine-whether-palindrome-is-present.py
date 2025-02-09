def is_pal(A):
    if A == A[::-1]:  
        print("Yes")
    else:
        print("No")

A = input()
is_pal(A)
