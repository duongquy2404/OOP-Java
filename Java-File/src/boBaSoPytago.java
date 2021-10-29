import java.util.Arrays;
import java.util.Scanner;

public class boBaSoPytago {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            boolean check=false;
            int n=sc.nextInt();
            long[] arr=new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();   
            }
            for (int i = 0; i < n; i++)
                arr[i] = arr[i] * arr[i];
            Arrays.sort(arr);
            /*for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();*/
            for (int i = n - 1; i >= 2; i--) {
                int l = 0; 
                int r = i - 1; 
                while (l < r) {
                    if (arr[l] + arr[r] == arr[i])
                        check=true;
 
                    if (arr[l] + arr[r] < arr[i])
                        l++;
                    else
                        r--;
                }
            }
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
