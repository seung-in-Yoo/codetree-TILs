def plus(a, c):
    return a + c

def minus(a, c):
    return a - c

def mul(a, c):
    return a * c

def div(a, c):
    if c == 0:
        return "0으로 나눌 수 없습니다."
    return a / c

def main():
    a, o, c = input().split()
    a = int(a)
    c = int(c)
    
    if o == '+':
        result = plus(a, c)
        print(f'{a} {o} {c} = {result}')
    elif o == '-':
        result = minus(a, c)
        print(f'{a} {o} {c} = {result}')
    elif o == '*':
        result = mul(a, c)
        print(f'{a} {o} {c} = {result}')
    elif o == '/':
        result = div(a, c)
        print(f'{a} {o} {c} = {result}')
    else:
        print("False")

if __name__ == "__main__":
    main()