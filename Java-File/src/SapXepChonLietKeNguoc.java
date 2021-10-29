import java.util.ArrayList;
import java.util.Scanner;

public class SapXepChonLietKeNguoc {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            ArrayList<String> res=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            for (int i = 0; i < n - 1; i++) {
                int value=arr.get(i);
                int location=i;
                for (int j = i + 1; j < n; j++) {
                    if(value>arr.get(j)){
                        value=arr.get(j);
                        location=j;
                    }
                }
                arr.set(location, arr.get(i));
                arr.set(i, value);
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