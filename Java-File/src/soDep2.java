import java.util.Scanner;

public class soDep2 {
    public static boolean checkC10(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(int)(s.charAt(i)-'0');
        }
        if(sum%10!=0){
            return false;
        }
        return true;
    }
    
    public static boolean soTN(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            String s=sc.next();
            if(checkC10(s)&&soTN(s)&&s.charAt(0)=='8'&&s.charAt(s.length()-1)=='8'){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
