N=gets.to_i
X,j=0,0
for i in 1..N
    P=gets.to_i
    j=P%10
    P=(P/10).to_i
    sum=P**j
    X=X+sum
end
puts(X)   
