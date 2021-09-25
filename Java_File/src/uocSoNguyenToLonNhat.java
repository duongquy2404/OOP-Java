import java.util.Scanner;

public class uocSoNguyenToLonNhat {
    public static boolean checkNT(long n){
        if(n<2){return false;}
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            long n=sc.nextLong();
            for(long i=n;i>=0;i--){
                if(n%i==0&&checkNT(i)){
                    System.out.println(i);
                    break;
                }
            }
            test--;
        }
    }
}
