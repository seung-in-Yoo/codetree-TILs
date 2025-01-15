def is_onnum(n):
    return not (n % 2 == 0 or n % 10 == 5 or (n % 3 == 0 and n % 9 != 0))

def count_onnums(a, b):
    count = 0
    for i in range(a, b + 1):
        if is_onnum(i):  
            count += 1
    return count

a, b = map(int, input().split())
print(count_onnums(a, b))