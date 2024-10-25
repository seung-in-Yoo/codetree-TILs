inp = input()
arr = inp.split()
start = int(arr[0])
end = int(arr[1])
answer = 0

for i in range(start,end+1):
    div_sum = 0
    for div in range(1,i):
        if i % div == 0:
            div_sum += div
    if div_sum == i:
        answer += 1

print(answer)