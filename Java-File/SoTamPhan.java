import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            String s=sc.next();
            Boolean check=true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2'){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
