numbers = list(map(int, input().split()))
satisfied = True
for number in numbers:
    if number % 3 != 0:
        satisfied = False
        break
if satisfied == True:
    print(1)
else:
    print(0)