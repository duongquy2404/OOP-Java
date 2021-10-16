import java.util.Scanner;

public class SoKhongLienKe{
    static long sumNumber(long n){
        long sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    static boolean checkNumber(long n){
        Boolean check=true;
        long tmp=n%10;
        n/=10;
        while(n>0){
            if(Math.abs(tmp-(n%10))!=2){
                check=false;
                break;
            }
            tmp=n%10;
            n/=10;
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            long n=sc.nextLong();
            if(sumNumber(n)%10==0&&checkNumber(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
