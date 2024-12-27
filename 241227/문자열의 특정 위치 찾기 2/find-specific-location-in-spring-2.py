str_5 = ["apple", "banana", "grape", "blueberry", "orange"]

eng_1 = input().strip()

result = []

for i in str_5:
    if len(i) >= 3 and (i[2] == eng_1 or (len(i) >= 4 and i[3] == eng_1)):
        result.append(i)

for res in result:
    print(res)

print(len(result))
