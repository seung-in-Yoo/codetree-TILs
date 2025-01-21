def is_seq(A, B):
    
    for i in range(len(A) - len(B) + 1):
        if A[i:i + n2] == B:
            return True
    return False

n1, n2 = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split()))


if is_seq(A, B):
    print("Yes")
else:
    print("No")
