import java.util.Scanner;
import java.math.BigInteger;

public class HieuSoNguyenLon1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            BigInteger n1=sc.nextBigInteger();
            BigInteger n2=sc.nextBigInteger();
            int count=0;
            System.out.println((n1.subtract(n2)).abs());
            test--;
        }
    }
}
