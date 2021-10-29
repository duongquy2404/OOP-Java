import java.util.Scanner;
public class chiaHetCho11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            String str=sc.next();
            int sum=0;
            for(int i=0;i<str.length();i++){
                if(i%2==0){
                    sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
                }
                else{
                    sum-=Integer.parseInt(String.valueOf(str.charAt(i)));
                }
            }
            if(sum%11==0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
            test-=1;
        }
    }
}
