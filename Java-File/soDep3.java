import java.util.Scanner;

public class soDep3 {
    public static boolean checkNT(int n){
        if(n<2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkSNT(String s){
        for(int i=0;i<s.length();i++){
            if(!checkNT((int)(s.charAt(i)-'0'))){
                return false;
            }
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
            if(checkSNT(s)&&soTN(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
