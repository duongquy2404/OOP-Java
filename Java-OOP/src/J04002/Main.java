
package J04002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectange rge=new Rectange(sc.nextDouble(),sc.nextDouble(),sc.next());
        if(rge.getWidth()>0&&rge.getHeight()>0){
            System.out.println((int)rge.findPerimeter()+" "+(int)rge.findArea()+" "+rge.getColor());
        }
        else{
            System.out.println("INVALID");
        }
    }
}
