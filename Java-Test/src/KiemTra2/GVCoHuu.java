
package KiemTra2;

public class GVCoHuu extends GiangVien implements ITinhLuong{
    private double soGioDM;
    
    public GVCoHuu(){
        
    }

    public GVCoHuu(String ma, String hoTen, double soGio, double soGioDM) {
        super(ma, hoTen, soGio);
        this.soGioDM = soGioDM;
    }

    public double getSoGioDM() {
        return soGioDM;
    }

    public void setSoGioDM(double soGioDM) {
        this.soGioDM = soGioDM;
    }

    @Override
    public double getLuong() {
        return soGioDM*140+(super.getSoGio()-soGioDM);
    }
    
    @Override
    public String toString(){
        return super.getMa()+"\t"+super.getHoTen()+"\t"+super.getSoGio()+"\t"+getLuong()+"\t"+soGioDM;
    }
}
