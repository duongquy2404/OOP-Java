import java.util.ArrayList;
import java.util.Scanner;

public class SapXepNoiBotLietKeNguoc {
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
            for (int i = 0; i < n; i++) {
                boolean check=false;
                for (int j = 0; j < n-i-1; j++) {
                    if(arr.get(j)>arr.get(j+1)){
                        int tmp=arr.get(j);
                        arr.set(j,arr.get(j+1));
                        arr.set(j+1,tmp);
                        check=true;
                    }
                }
                if(!check){
                    break;
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
            int count=res.size();
            for (int i = res.size()-1; i >= 0; i--) {
                System.out.println("Buoc "+count+": "+res.get(i));
                count--;
            }
            test--;
        }
    }
}
