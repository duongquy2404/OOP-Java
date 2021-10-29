import java.util.Scanner;

public class DanhDauChuCai {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(char i='a';i<='z';i++){
            if(s.indexOf(i)!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
