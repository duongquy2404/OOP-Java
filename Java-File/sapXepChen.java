import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class sapXepChen {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            arrayList.add(arr[i]);
            System.out.print("Buoc "+(i)+": ");
            Collections.sort(arrayList);
            for(int j:arrayList){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
