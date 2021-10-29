import java.util.Scanner;

public class SoChinhPhuong {
    static  boolean isPerfectSquare(long x) {
        long s = (long) Math.sqrt(x);
        return (s*s == x);
    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            long n=sc.nextLong();
            if(isPerfectSquare(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
