import java.util.Scanner;
import java.math.BigInteger;

public class ChiaHet {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            if(a.mod(b)==BigInteger.ZERO||b.mod(a)==BigInteger.ZERO){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            test--;
        }
    }
}
