import java.util.Scanner;

public class XauDoiXung {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            String str=sc.next();
            int count=0;
            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                    count++;
                }
            }
            /*if(str.length()%2==0){
                if(count==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if(count>=1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }*/
            if(count<=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
