import java.util.Scanner;

public class QuayPhai {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int res=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]<arr[i-1]){
                    res=i;
                    break;
                }
            }
            System.out.println(res);
            test--;
        }
    }
}
