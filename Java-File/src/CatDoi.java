import java.util.Scanner;

public class CatDoi {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            String s=sc.next();
            String res="";
            Boolean check=true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    res+='0';
                }
                else if(s.charAt(i)=='1'){
                    res+='1';
                }
                else if(s.charAt(i)=='8'){
                    res+='0';
                }
                else if(s.charAt(i)=='9'){
                    res+='0';
                }
                else{
                    check=false;
                }
            }
            if(check){
                if(res.indexOf('1')==-1){
                    System.out.println("INVALID");
                    test--;
                    continue;
                }
                while(res.charAt(0)=='0'){
                    res=res.substring(1);
                }
                System.out.println(res);
            }
            else{
                System.out.println("INVALID");
            }
            test--;
        }
    }
}
