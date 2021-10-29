
package KiemTra2;


public class GiangVien {
    private String ma;
    private String hoTen;
    private double soGio;
    private double luong;
    public GiangVien(){
        
    }

    public GiangVien(String ma, String hoTen, double soGio) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.soGio = soGio;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getSoGio() {
        return soGio;
    }

    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }
    
    public double getLuong(){
        return luong;
    }
}
