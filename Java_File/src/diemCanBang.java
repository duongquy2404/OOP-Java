import java.util.Scanner;

public class diemCanBang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        while(test>0){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
                sum+=arr[i];
            }
            int begin=0;
            int location=-2;
            for(int i=0;i<n;i++){
                sum-=arr[i];
                if(begin==sum){
                    location=i;
                    break;
                }
                begin+=arr[i];
            }
            System.out.println(location+1);
            test--;
        }
    }
}
