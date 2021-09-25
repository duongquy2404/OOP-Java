import java.util.Scanner;

public class giaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        if(a==0&&b!=0){
            System.out.println("VN");
        }
        else if(a==0&&b==0){
            System.out.println("VSN");
        }
        else{
            System.out.printf("%.2f", -b/a);
            System.out.println();
        }
    }
}
