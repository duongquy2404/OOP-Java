import java.util.Scanner;

public class soNguyenTo {
    public static boolean checkNT(int n){
        if(n<2){return false;}
        for(int i=2;i<=Math.sqrt(n);i++){
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
            int n=sc.nextInt();
            if(checkNT(n)==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
    
}
