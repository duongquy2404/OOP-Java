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
            int res=0;
            for(int i=2;i<=n;i++){
                while(n%i==0){
                    res=i;
                    n/=i;
                }
            }
            System.out.println(res);
            test--;
        }
    }
}
