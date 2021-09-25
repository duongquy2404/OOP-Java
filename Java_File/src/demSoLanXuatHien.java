import java.util.Scanner;

public class demSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        int buoc=test;
        while(test>0){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            int[] brr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=scanner.nextInt();
            }
            System.out.println("Test "+(buoc-test+1)+":");
            for(int i=0;i<arr.length;i++){
                if(brr[i]==0){
                    System.out.print(arr[i]+" xuat hien ");
                    int count=0;
                    brr[i]=1;
                    for(int j=i;j<arr.length;j++){
                        if(arr[j]==arr[i]){
                            brr[j]=1;
                            count++;
                        }
                    }
                    System.out.println(count+" lan");
                }
            }
            test--;
        }
    }
}
