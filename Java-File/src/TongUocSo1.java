import java.util.Scanner;

public class TongUocSo1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[2000000];
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int m=sc.nextInt();
            for(int i=2;i<=m;i++){
                while(n%2==0){
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
        System.gc();
    }
}
