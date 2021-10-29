import java.util.Scanner;

public class KiemTraSoFibonacci {
    static  boolean isPerfectSquare(long x) {
        long s = (long) Math.sqrt(x);
        return (s*s == x);
    }
    static boolean isFibonacci(long n) {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            long n=sc.nextLong();
            if(isFibonacci(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
