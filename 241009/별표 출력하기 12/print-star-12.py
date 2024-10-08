n = int(input())

for i in range(n):
    if i % 2 == 0:
        print('* ' * ((n + 1) // 2))
    else:
        spaces = ' ' * (2 * (i // 2) + 1)
        stars = '*' + spaces
        print(stars * ((n - i + 1) // 2))