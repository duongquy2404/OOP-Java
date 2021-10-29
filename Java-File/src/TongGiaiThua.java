import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0;
        long tmp=1;
        for(int i=1;i<=n;i++){
            tmp*=i;
            sum+=tmp;
        }
        System.out.println(sum);
    }
}
