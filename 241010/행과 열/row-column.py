inp = input()
arr = inp.split()
a = int(arr[0])
b = int(arr[1])

for i in range(1,5):
    for j in range(1,6):
        print(i*j, end=" ")
    print()