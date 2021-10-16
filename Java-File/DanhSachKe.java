import java.util.Scanner;

public class DanhSachKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("List("+(i+1)+") = ");
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }
    }
}
