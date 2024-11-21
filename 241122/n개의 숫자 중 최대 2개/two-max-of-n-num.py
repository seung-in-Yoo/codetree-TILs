N = int(input())
N_list = list(map(int,input().split()))

Sort_list = sorted(N_list, reverse=True)

print(Sort_list[0], Sort_list[1])