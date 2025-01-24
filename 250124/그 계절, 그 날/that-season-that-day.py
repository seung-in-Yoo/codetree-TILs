def leap_year(Y):
    if Y % 4 == 0:
        if Y % 100 == 0:
            if Y % 400 == 0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False

def season(Y, M, D):
    
    days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    if leap_year(Y):
        days_in_month[1] = 29
    
    if M < 1 or M > 12 or D < 1 or D > days_in_month[M - 1]:
        return -1  
    
    
    if 3 <= M <= 5:
        return "Spring"
    elif 6 <= M <= 8:
        return "Summer"
    elif 9 <= M <= 11:
        return "Fall"
    elif M == 12 or M == 1 or M == 2:
        return "Winter"

Y, M, D = map(int, input().split())

result = season(Y, M, D)
print(result)

    
