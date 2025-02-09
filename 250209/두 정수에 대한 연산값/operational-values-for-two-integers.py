a, b = map(int, input().split())

def cal(a, b):
    if a > b:
        c = a + 25
        d = b * 2
    else:
        c = b + 25
        d = a * 2
    return d, c  

new_a, new_b = cal(a, b)
print(new_a, new_b)

