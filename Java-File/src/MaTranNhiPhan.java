import java.util.Scanner;

public class MaTranNhiPhan {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<3;j++){
                if(arr[i][j]==1){
                    c++;
                }
            }
            if(c>1){
                count++;
            }
        }
        System.out.println(count);
    }
}
