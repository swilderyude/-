def hanoi(n,a,b,c):
    if n>0:
        hanoi(n-1,a,c,b)
        print("#%d:moving from %s to %s."%(num,a,c))
        hanoi(n-1,b,a,c)

hanoi(3,'a','b','c')