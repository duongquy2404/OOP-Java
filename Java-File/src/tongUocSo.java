import java.util.Scanner;

public class tongUocSo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        while(n>0){
            int m=sc.nextInt();
            int tmp=m;
            int sum=0;
            for(int i=2;i<=m;i++){
                while(tmp%i==0){
                    tmp/=i;
                    sum+=i;
                }
                if(tmp<i){
                    break;
                }
            }
            if(tmp!=1){sum+=tmp;}
            res+=sum;
            n--;
        }
        System.out.println(res);
    }
}
