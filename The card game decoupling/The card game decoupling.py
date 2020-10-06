for t in range(int(input())):
    x=int(input())
    y=[int (g) for g in input().split()]
    a=0
    c=0
    for i in range(x):
        b=max(y[0],y[-1])
        if i%2==0:
            a=a+b
        else:
            c=c+b
        y.remove(b)
    print(a,c)