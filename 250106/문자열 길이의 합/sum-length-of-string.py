n = int(input())  
strings = [input() for _ in range(n)]  

total_length = sum(len(s) for s in strings)

count_a = sum(1 for s in strings if s.startswith('a'))

print(total_length, count_a)