import java.util.ArrayList;
import java.util.Scanner;

public class SapXepDoiChoTrucTiepLietKeNguoc {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            ArrayList<String> res=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if(arr.get(i)>arr.get(j)){
                        int tmp=arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, tmp);
                    }
                }
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
            test--;
        }
    }
}
