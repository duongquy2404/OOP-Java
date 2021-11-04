import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TapTuRiengCuaHaiXau {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        while(test>0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            TreeSet<String> lhs=new TreeSet<>();
            String[] S1=s1.split("\\s");
            String[] S2=s2.split("\\s");
            for (int i = 0; i < S1.length; i++) {
                lhs.add(S1[i]);
            }
            Iterator<String> it=lhs.iterator();
            while(it.hasNext()){
                boolean check=true;
                String tmp=it.next();
                for(int j=0;j<S2.length;j++){
                    if(S2[j].equals(tmp)){
                        check=false;
                    }
                }
                if(check){
                    System.out.print(tmp+" ");
                }
            }
            System.out.println();
            test--;
        }
    }
}
