import java.util.Scanner;

public class uocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            double n=sc.nextDouble();
            if(n%2!=0){
                System.out.println(0);
            }
            else{
                double count=0;
                double k=1;
                while(n>=Math.pow(2, k)){
                    k++;
                }
                k--;
                while(n%Math.pow(2, k)!=0){
                    k--;
                }
                if(n==Math.pow(2, k)){
                    count=k;
                }
                else{
                    double x=n/(Math.pow(2, k));
                    double tmp=0;
                    for(int i=1;i<=x;i++){
                        if(x%i==0){
                            tmp++;
                        }
                    }
                    count=k*tmp;
                }
                System.out.println(Math.round(count));
            }
            test--;
        }
    }
}
