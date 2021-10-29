import java.util.Scanner;

public class mangDoiXung {
    public static boolean checkDX(int[] arr){
        for(int i=0;i<=arr.length/2;i++){
            if(arr[i]!=arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            if(checkDX(arr)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
