import java.util.Scanner;

public class tinhSoFibonacci {
    
    public static void arrFibo(long [] arr){
        arr[0]=arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
    }
    
    public static void main(String[] args) {
        long[] arr=new long[92];
        arrFibo(arr);
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            int n=sc.nextInt();
            System.out.println(arr[n-1]);
            test--;
        }
    }
}
