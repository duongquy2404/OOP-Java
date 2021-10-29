import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            hs.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            hs.add(sc.nextInt());
        }
        ArrayList<Integer> al=new ArrayList<Integer>(hs);
        Collections.sort(al);
        for(int i:al){
            System.out.print(i+" ");
        }
    }
}
