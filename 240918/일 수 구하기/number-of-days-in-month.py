n = int(input()) 
if n%2==0:
    if n==2:
        print("28")
    elif n==8 or n==10 or n==12:
        print("31")
    else:
        print("30")
else:
    if n==9 or n==11:
        print("30")
    else:
        print("31")