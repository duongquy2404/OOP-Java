import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepChenLietKeNguoc {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<String> res=new ArrayList<>();
        arr.add(sc.nextInt());
        res.add(Integer.toString(arr.get(0)));
        for (int i = 1; i < n; i++) {
            arr.add(sc.nextInt());
            Collections.sort(arr);
            String tmp="";
            for(int j=0;j<arr.size();j++){
                tmp+=arr.get(j);
                if(j<arr.size()-1){
                    tmp+=" ";
                }
            }
            res.add(tmp);
        }
        int count=n-1;
        for (int i = res.size()-1; i >= 0; i--) {
            System.out.println("Buoc "+count+": "+res.get(i));
            count--;
        }
    }
}
