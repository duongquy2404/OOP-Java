import java.util.Scanner;

public class soLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            long n=sc.nextLong();
            boolean check=true;
            long tmp=n%10;
            n/=10;
            while(n>0){
                if(Math.abs(tmp-(n%10))!=1){
                    check=false;
                    break;
                }
                tmp=n%10;
                n/=10;
            }
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
