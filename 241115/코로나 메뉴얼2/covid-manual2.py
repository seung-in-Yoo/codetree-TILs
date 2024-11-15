people = [input().split() for _ in range(3)]

a_count = 0
b_count = 0
c_count = 0
d_count = 0


for sym, temp in people:
    temp = float(temp)  
    if sym == "Y" and temp >= 37:
        a_count += 1  
    elif sym == "N" and temp >= 37:
        b_count += 1  
    elif sym == "Y" and temp < 37:
        c_count += 1  
    else:
        d_count += 1  

print(a_count, b_count, c_count, d_count, end="")


if a_count >= 2:
    print(" E")  
else:
    print()
