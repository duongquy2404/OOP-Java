package J04005;

import java.util.Scanner;

public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String dob=sc.next();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(name+" "+dob+" "+(a+b+c));
    }
}
