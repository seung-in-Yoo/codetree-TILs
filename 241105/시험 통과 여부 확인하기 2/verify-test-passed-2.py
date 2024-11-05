n = int(input())
pass_people = 0

for i in range(n):
    scores = list(map(int, input().split()))
    score_sum = sum(scores)
    score_avg = score_sum/4
    if score_avg >= 60:
        print("pass")
        pass_people += 1
    else:
        print("fail")

print(pass_people)