import java.util.ArrayList;
import java.util.Scanner;

public class DiaChiEmail {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        ArrayList<String> s=new ArrayList<>();
        while(test>0){
            String str=sc.nextLine();
            str=str.trim().toLowerCase().replaceAll("\\s+", " ");
            String[] temp=str.split(" ");
            String res=temp[temp.length-1];
            for (int i = 0; i < temp.length - 1; i++) {
                res+=temp[i].charAt(0);
            }
            int count=1;
            for(int i=0;i<s.size();i++){
                if(res.equals(s.get(i))){
                    count++;
                }
            }
            if(count==1){
                System.out.print(res);
            }
            else{
                System.out.print(res+count);
            }
            System.out.println("@ptit.edu.vn");
            s.add(res);
            test--;
        }
    }
}
