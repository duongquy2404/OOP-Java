import java.util.Scanner;

public class phanTichThuaSoNguyenTo {
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
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        int buoc=test;
        while(test>0){
            int n=scanner.nextInt();
            System.out.print("Test "+(buoc-test+1)+": ");
            for(int i=2;i<=n;i++){
                if(checkNT(i)&&n%i==0){
                    System.out.print(i);
                    int count=0;
                    while(n%i==0){
                        n/=i;
                        count++;
                    }
                    System.out.print("("+count+") ");
                }
            }
            System.out.println();
            test--;
        }
    }
}
