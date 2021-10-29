
package KiemTra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QLGD implements IChucNang{
    private List<GiangVien> list;
    private Scanner sc=new Scanner(System.in);

    public QLGD() {
        list=new ArrayList<>();
        list.add(new GVCoHuu("GV1234","Nguyen Ha",50,40));
        list.add(new GVCoHuu("GV1256","Nguyen Lan",50,40));
        list.add(new GVTGiang("GV1236","Nguyen Binh",60,55,2));
        list.add(new GVTGiang("GV1289","Nguyen Toan",60,55,2));
    }
    
    private int checkTL(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }
    
    private GiangVien nhap(){
        String ma;
        String hoTen;
        double soGio;
        String reg="^GV\\d{4}";
        while(true){
            System.out.print("Nhap ma:");
            ma=sc.nextLine().toUpperCase();
            if(checkTL(ma)==-1&&ma.matches(reg)){
                break;
            }
            System.err.println("Moi nhap lai!!!");
        }
        System.out.print("Nhap ten:");
        hoTen=sc.nextLine();
        System.out.print("Nhap so gio:");
        soGio=Double.parseDouble(sc.nextLine());
        return new GiangVien(ma,hoTen,soGio);
    }

    @Override
    public void nhapGVCH(){
        GiangVien s=nhap();
        System.out.print("Nhap so gio dm:");
        double soGioDM=Double.parseDouble(sc.nextLine());
        list.add(new GVCoHuu(s.getMa(),s.getHoTen(),s.getSoGio(),soGioDM));
    }

    @Override
    public void nhapGVTG() {
        GiangVien s=nhap();
        System.out.print("Nhap so gio dm:");
        double soGioDM=Double.parseDouble(sc.nextLine());
        System.out.print("Nhap he so:");
        double heSo=Double.parseDouble(sc.nextLine());
        list.add(new GVTGiang(s.getMa(),s.getHoTen(),s.getSoGio(),soGioDM,heSo));
    }

    @Override
    public void vietDS() {
        System.out.println("Danh sach GVCH");
        for(GiangVien i:list){
            if(i instanceof GVCoHuu){
                System.out.println(i);
            }
        }
        System.out.println("------------");
        System.out.println("Danh sach GVTG");
        for(GiangVien i:list){
            if(i instanceof GVTGiang){
                System.out.println(i);
            }
            
        }
        System.out.println("------------");
    }

    @Override
    public void suaGV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void timGV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sumGV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
