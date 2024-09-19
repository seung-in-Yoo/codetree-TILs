person1 = input().split()
person2 = input().split()
person3 = input().split()

a_count = 0

if person1[0] == 'Y' and float(person1[1]) >= 37:
    a_count += 1

if person2[0] == 'Y' and float(person2[1]) >= 37:
    a_count += 1

if person3[0] == 'Y' and float(person3[1]) >= 37:
    a_count += 1


if a_count >= 2:
    print('E')
else:
    print('N')