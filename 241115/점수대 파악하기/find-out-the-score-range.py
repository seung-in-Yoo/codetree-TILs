scores = list(map(int, input().split()))
score_list = [0] * 10
for score in scores:
    if score == 0:
        break
    if score >= 10: 
        if score == 100:
            range_idx = 9
        else:
            range_idx = (score // 10) - 1  
        score_list[range_idx] += 1  

for i in range(9, -1, -1): 
    print(f'{(i + 1) * 10} - {score_list[i]}')
        