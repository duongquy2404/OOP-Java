import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class thuGonDaySo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int i=0;
        while(i<list.size()-1){
            if((list.get(i)+list.get(i+1))%2==0){
                list.remove(i);
                list.remove(i);
                i=-1;
            }
            i++;
        }
        System.out.println(list.size());
    }
}
