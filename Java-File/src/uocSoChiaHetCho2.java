import java.util.Scanner;

public class uocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            int n=sc.nextInt();
            if(n%2==0){
                int count=0;
                while(n%2==0){
                    count++;
                    n/=2;
                }
                int uocso=0;
                for(int i=1;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        uocso+=2;
                    }
                    if(i==Math.sqrt(n)){
                        uocso-=1;
                    }
                }
                System.out.println(count*uocso);
            }
            else{
                System.out.println(0);
            }
            test--;
        }
    }
}
