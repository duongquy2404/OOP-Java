import java.util.Scanner;

public class tichMaTranVoiChuyenViCuaNo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int tmp=1;
        while(test>0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            int[][] brr=new int[m][n];
            int[][] crr=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                    //brr[j][i]=arr[i][j];
                }
            }
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    brr[j][i] = arr[i][j];
                }
            }
            System.out.println("Test "+tmp+":");
            tmp++;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    for(int l = 0; l < m; l++) {
                        crr[i][j] += arr[i][l] * brr[l][j];
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(crr[i][j]+" ");
                }
                System.out.println();
            }
            test--;
        }
    }
}
