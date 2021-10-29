import java.util.Scanner;
import java.math.BigInteger;

public class BoiSoChungNhoNhat {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            BigInteger n1=sc.nextBigInteger();
            BigInteger n2=sc.nextBigInteger();
            System.out.println((n1.multiply(n2)).divide(n1.gcd(n2)));
            test--;
        }
    }
}
