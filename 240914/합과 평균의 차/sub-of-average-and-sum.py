inp = input()
arr = inp.split()
a = int(arr[0])
b = int(arr[1])
c = int(arr[2])
plus = int(a+b+c)
avg = int((a+b+c)/3)
minus = int(plus - avg)

print(f'{plus:.0f}')
print(f'{avg:.0f}')
print(f'{minus:.0f}')