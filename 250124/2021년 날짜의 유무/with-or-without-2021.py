M, D = map(int, input().split())

def check_date(M, D):
    days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    if 1 <= M <= 12:
        if 1 <= D <= days_in_month[M - 1]:
            return "Yes"
        else:
            return "No"
    else:
        return "No"

print(check_date(M,D))