score = list(map(float, input().split()))

score_sum = 0
count = 0
score_avg = 0

for i in score:
    score_sum += i
    count += 1
    score_avg = score_sum/count
print(score_avg)