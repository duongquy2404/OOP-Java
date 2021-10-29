import java.util.Scanner;

public class TapTuRiengCuaHaiXau {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String[] S1=s1.split("\\s");
            for (int i = 0; i < S1.length; i++) {
                if(!s2.contains(S1[i])){
                    System.out.print(S1[i]+"\n");
                }
            }
            test--;
        }
    }
}
