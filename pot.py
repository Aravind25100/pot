N=int(input())
X,j=0,0
for i in range(N):
    P=int(input())
    j=P%10
    P=P//10
    X=X+(P**j)
print(X)   
