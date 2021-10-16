import java.util.Scanner;

public class sapXepChon {
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
        for(int i=0;i<arr.length-1;i++){
            int tmp=arr[i];
            int location=i;
            for(int j=i+1;j<arr.length;j++){
                if(tmp>arr[j]){
                    tmp=arr[j];
                    location=j;
                }
            }
            if(tmp!=arr[i]){
                int tmp2=arr[i];
                arr[i]=arr[location];
                arr[location]=tmp2;
            }
            System.out.print("Buoc "+(i+1)+": ");
            result(arr);
        }
    }
}
