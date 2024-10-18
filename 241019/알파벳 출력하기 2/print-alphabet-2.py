N = int(input())
count = 65

for i in range(N):
    print("  "*i, end="")
    for j in range(N-i):
        print(chr(count), end=" ")
        count += 1
        if count == 91:
            count = 65
    print()