import java.util.Scanner;

public class UocSoNguyenToLonNhat {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            long n=sc.nextLong();
            long m=n;
            long res=1;
            for(int i=2;i<Math.sqrt(n);i++){
                while(m%i==0){
                    m/=i;
                    res=i;
                }
                if(m<i){
                    break;
                }
            }
            if(m!=1){
                res=m;
            }
            System.out.println(res);
            test--;
        }
    }
}
