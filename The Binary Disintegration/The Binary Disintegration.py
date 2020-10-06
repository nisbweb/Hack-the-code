for i in range(int(input())):
    num = input()
    x = len(num)
    y = num.rfind('1')
    z = num.count('1')
    print(x+y-z+(2 if z>1 else 0))