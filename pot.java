import java.util.*;
class pot{
    public static void main(String []args){
        Scanner kbd=new Scanner(System.in);
        int P,X=0,j=0;
        int N=kbd.nextInt();
        for (int i=0;i<N;i++){
          P=kbd.nextInt();
          j=P%10;
          P=(int)P/10;
          int sum=1;
          for(int k=0;k<j;k++)
            sum*=P;
          X+=sum;
        }
        System.out.println(X);       
    }
}