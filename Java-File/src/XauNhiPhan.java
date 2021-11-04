import java.util.Scanner;

public class XauNhiPhan {
    static long[]  arr=new long[94];
    
    static int binaryString(int n,long i){
        if(n==1){
            return (int)0;
        }
        else if(n==2){
            return (int)1;
        }
        else{
            if(i<=arr[n-2]){
                return binaryString(n-2, i);
            }
            else{
                return binaryString(n-1, i-arr[n-2]);
            }
        }
    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        arr[1]=1; arr[2]=1;
        for(int i=3;i<94;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        int test=sc.nextInt();
        while(test>0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            System.out.println(binaryString(n, k));
            test--;
        }
    }
}
