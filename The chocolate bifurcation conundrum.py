r=int(input())
for t in range(r):
  n = int(input())
 
  print(n//2)
  print("2 "*(n//2-n%2) + "3"*(n%2))
      