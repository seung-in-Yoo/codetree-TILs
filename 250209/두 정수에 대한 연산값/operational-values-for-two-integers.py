a, b = tuple(map(int, input().split()))

def change_number(a, b):
    if(a > b):
        b *= 2
        a += 25
    else:
        a *= 2
        b += 25

    return a, b

a, b = change_number(a, b)

print(a, b)