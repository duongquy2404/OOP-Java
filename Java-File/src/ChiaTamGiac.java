import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            for(int i=1;i<n;i++){
                System.out.printf("%.6f",h*Math.sqrt((double)i/n));
                System.out.print(" ");
            }
            System.out.println();
            test--;
        }
    }
}
