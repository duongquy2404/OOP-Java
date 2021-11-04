package J05005;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(new SinhVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(arr);
        arr.forEach(i -> {
            System.out.println(i);
        });
    }
}
