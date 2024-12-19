a = input()
b = input()
c = input()

length = [len(a), len(b), len(c)]

result = max(length) - min(length)

print(result)
