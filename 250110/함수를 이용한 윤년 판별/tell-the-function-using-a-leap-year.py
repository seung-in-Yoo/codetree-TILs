def leap_year(y):
    if (y % 4 == 0 and y % 100 != 0) or (y % 400 == 0):
        return "true"
    else:
        return "false"

y = int(input())

print(leap_year(y))
