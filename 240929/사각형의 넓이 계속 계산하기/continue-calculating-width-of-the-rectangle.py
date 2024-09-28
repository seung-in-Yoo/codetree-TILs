while True:
    inp = input()
    arr = inp.split()
    width = int(arr[0])
    height = int(arr[1])
    a = arr[2]

    extent = width * height
    print(extent)

    if a == 'C':
        break