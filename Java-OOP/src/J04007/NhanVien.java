
package J04007;

import java.util.Date;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maST;
    private String ngayKHD;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maST, String ngayKHD) {
        this.maNV = "00001";
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maST = maST;
        this.ngayKHD = ngayKHD;
    }
    
    public String toString(){
        return maNV+" "+hoTen+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maST+" "+ngayKHD;
    }
}
