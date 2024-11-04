n = int(input())
results = []

for _ in range(n):
    inp = input()
    arr = inp.split()
    a = int(arr[0])
    b = int(arr[1])
    count = 0
    for i in range(a,b+1):
        if i%2==0:
            count+=i
    results.append(count)

for result in results:
    print(result)