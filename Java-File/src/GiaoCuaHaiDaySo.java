import java.util.Arrays;
import java.util.Scanner;

public class GiaoCuaHaiDaySo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] brr=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<m;i++){
            brr[i]=sc.nextInt();
        }
        Arrays.sort(brr);
        int k=0,h=0;
        while(k<n&&h<m){
            if(arr[k]<brr[h]){
                k++;
            }
            else if(arr[k]>brr[h]){
                h++;
            }
            else{
                System.out.print(arr[k]+" ");
                int tmp=arr[k];
                while(k<n&&arr[k]==tmp){
                    k++;
                }
                while(h<m&&brr[h]==tmp){
                    h++;
                }
            }
        }
    }
}
