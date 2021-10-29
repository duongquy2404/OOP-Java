import java.util.ArrayList;
import java.util.Scanner;

public class BoSungDaySo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            while(count<x){
                arr.add(count);
                count++;
            }
            count++;
        }
        if(arr.size()==0){
            System.out.println("Excellent!");
        }
        else{
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i)+" ");
            }
        }
    }
}
