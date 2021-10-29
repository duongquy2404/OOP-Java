import java.util.Scanner;

public class soDep1 {
    public static boolean checkSC(String s){
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)%2!=0){
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
            if(checkSC(s)&&soTN(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
