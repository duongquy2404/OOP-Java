
package J04008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            Point p1=new Point(sc.nextDouble(),sc.nextDouble());
            Point p2=new Point(sc.nextDouble(),sc.nextDouble());
            Point p3=new Point(sc.nextDouble(),sc.nextDouble());
            Point v12=new Point(p2.getX()-p1.getX(),p2.getY()-p1.getY());
            Point v13=new Point(p3.getX()-p1.getX(),p3.getY()-p1.getY());
            if(v12.getX()*v13.getY()==v12.getY()*v13.getX()){
                System.out.println("INVALID");
            }
            else{
                System.out.println(String.format("%.3f", p1.distance(p2)+p2.distance(p3)+p3.distance(p1)));
            }
            test--;
        }
    }
}
