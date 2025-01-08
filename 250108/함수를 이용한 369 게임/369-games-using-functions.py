def contain_369_or_multiple(n):
    if n % 3 == 0:
        return True
    for digit in str(n):  
        if digit in "369":
            return True
    return False

def game_369(a, b):
    count = 0
    for i in range(a, b + 1):  
        if contain_369_or_multiple(i):
            count += 1
    return count

a, b = map(int, input().split())

print(game_369(a, b))