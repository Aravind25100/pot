#include<iostream>
using namespace std;
int main(){
    int N,P,X=0,j=0;
    cin >> N;
    for (int i=0;i<N;i++){
        cin >> P;
        j=P%10;
        P=int(P/10);
        int sum=1;
        for(int k=0;k<j;k++)
          sum*=P;
        X+=sum;
        }
       cout << X;
}