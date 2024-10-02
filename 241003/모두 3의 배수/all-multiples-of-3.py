numbers = list(map(int, input().split()))
satisfied = False
for number in numbers:
    if number % 3 == 0:
        satisfied = True
        break
if satisfied == True:
    print(1)
else:
    print(0)