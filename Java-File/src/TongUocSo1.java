import java.util.Scanner;

public class TongUocSo1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int m=sc.nextInt();
            int i=2;
            while(m>1){
                while(m%i==0){
                    sum+=i;
                    m/=i;
                }
                i++;
            }
            n--;
        }
        System.out.println(sum);
        System.gc();
    }
}
