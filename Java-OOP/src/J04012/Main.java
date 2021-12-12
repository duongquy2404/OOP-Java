
package J04012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NhanVien nv=new NhanVien(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.next());
        System.out.println(nv.toString());
    }
}
