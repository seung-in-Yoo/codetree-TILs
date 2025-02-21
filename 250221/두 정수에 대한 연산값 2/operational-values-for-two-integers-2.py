def num_cal(a, b):
    if a < b:
        a2 = a + 10
        b2 = b * 2
    else:
        a2 = a * 2
        b2 = b + 10
    return a2, b2  

a, b = map(int, input().split())

a, b = num_cal(a, b)

print(a, b)