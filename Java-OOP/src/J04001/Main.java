
package J04001;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            Point p1=new Point(sc.nextDouble(),sc.nextDouble());
            Point p2=new Point(sc.nextDouble(),sc.nextDouble());
            System.out.println(String.format("%.4f",p1.distance(p2)));
            test--;
        }
    }
}
