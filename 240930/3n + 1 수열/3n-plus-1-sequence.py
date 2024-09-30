N = int(input())
count = 0
while True:
    if N%2==0:
        N = N/2
        count = count+1
    else:
        N = N*3+1
        count = count+1
    if N == 1:
        print(count)
        break