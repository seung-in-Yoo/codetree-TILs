n = int(input())
numbers = list(map(int, input().split()))


min_difference = float('inf')  

for i in range(len(numbers) - 1):
    difference = numbers[i + 1] - numbers[i]
    if difference < min_difference:
        min_difference = difference

print(min_difference)
