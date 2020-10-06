ls = []
for i in range(int(input())):
    a = input()
    ls.append(a)
print(len(ls)-len(set(ls)))
    