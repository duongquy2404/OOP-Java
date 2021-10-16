import java.util.Scanner;

public class boiSoChung_uocSoChung {
    public static long ucln(long a,long b){
        while(a*b!=0){
            if(a>b){
                a%=b;
            }
            else{
                b%=a;
            }
        }
        return a+b;
    }
    
    public static long bcnn(long a,long b){
        return (a*b)/ucln(a, b);
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        while(test>0){
            long a=scanner.nextInt();
            long b=scanner.nextInt();
            System.out.println(bcnn(a, b) +" "+ucln(a, b));
            test--;
        }
    }
}
