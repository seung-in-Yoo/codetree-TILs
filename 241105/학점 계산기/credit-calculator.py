n = int(input())  
grades = list(map(float, input().split()))  

grade_avg = sum(grades) / n

print(round(grade_avg, 1))

if grade_avg >= 4.0:
    print("Perfect")
elif grade_avg >= 3.0:
    print("Good")
else:
    print("Poor")