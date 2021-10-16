import java.util.Scanner;

public class sapXepNoiBot {
    public static void result(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int buoc=1;
        for(int i=0;i<arr.length-1;i++){
            Boolean check=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    check=true;
                }
            }
            if(check){
                System.out.print("Buoc "+(i+1)+": ");
                result(arr);
            }
            else{
                break;
            }
        }
    }
}
