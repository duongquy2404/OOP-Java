package J04006;


import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhaiBaoLopSinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private Date ngaySinh;
    private float gpa;

    public KhaiBaoLopSinhVien() {
    }

    public KhaiBaoLopSinhVien(String hoTen, String lop, String ngaySinh, float gpa) throws ParseException {
        this.maSV = "B20DCCN001";
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }
    
    public String toString(){
        return String.format("%s %s %s %s %.2f", maSV,hoTen,lop,new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh),gpa);
    }
    
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        KhaiBaoLopSinhVien kblsv=new KhaiBaoLopSinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
        System.out.println(kblsv);
    }
}
