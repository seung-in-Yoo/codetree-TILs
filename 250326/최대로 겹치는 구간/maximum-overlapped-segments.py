n = int(input())
events = [] 

# 선분의 시작점과 끝점 저장
for i in range(n):
    start, end = map(int, input().split())
    events.append((start, 1))  # 시작 포인트
    events.append((end, -1))   # 끝 포인트

# 정렬하기
events.sort()

current_panel = 0 # 겹치는 선분 개수
max_panel = 0 # 최대로 겹친 선분 개수 

# 겹치는 구간의 개수 계산
for i in range(len(events)): 
    event = events[i][1]  
    current_panel += event
    max_panel = max(max_panel, current_panel)

print(max_panel)
