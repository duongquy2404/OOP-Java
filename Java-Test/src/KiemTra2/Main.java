
package KiemTra2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QLGD q=new QLGD();
        while(true){
            System.out.println("------MENU------");
            System.out.println("1.Nhap GVCH");
            System.out.println("2.Nhap GVTG");
            System.out.println("3.Hien thi danh sach");
            System.out.println("4.Sua GV");
            System.out.println("5.Tim GV");
            System.out.println("6.Tong GV theo sgdm");
            System.out.println("7.Thoat khoi Menu");
            System.out.println("-----------------");
            System.out.println("Chon tu 1->7:");
            
            int n=Integer.parseInt(sc.nextLine());
            switch(n){
                case 1: q.nhapGVCH();
                    break;
                case 2: q.nhapGVTG();
                    break;
                case 3: q.vietDS();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7: System.out.println("Good Bye!!!");
                        System.exit(7);
                    break;
                default: System.out.println("Chi chon tu 1->7!!!");
                    break;
            }
        }
    }
}
