n = int(input())
	
for i in range(1, n + 1):
	if i == 1:
		continue
	prime = True
	
	for j in range(2, i):
		if i % j == 0:
			prime = False
	
	if prime:
		print(i, end=" ")