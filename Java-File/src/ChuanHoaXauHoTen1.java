import java.util.Scanner;

public class ChuanHoaXauHoTen1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        while(test>0){
            String str=sc.nextLine();
            str=str.trim().toLowerCase();
            str=str.replaceAll("\\s+", " ");
            String temp[] = str.split(" ");
            str = ""; 
            for (int i = 0; i < temp.length; i++) {
                str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                if (i < temp.length - 1)
                    str += " ";
            }
            System.out.println(str);
            test--;
        }
    }
}
