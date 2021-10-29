
package KiemTra2;

public class GVTGiang extends GiangVien implements ITinhLuong{
    private double soGioDM;
    private double heSo;

    public GVTGiang() {
    }

    public GVTGiang(String ma, String hoTen, double soGio, double soGioDM, double heSo) {
        super(ma, hoTen, soGio);
        this.soGioDM = soGioDM;
        this.heSo = heSo;
    }

    public double getSoGioDM() {
        return soGioDM;
    }

    public void setSoGioDM(double soGioDM) {
        this.soGioDM = soGioDM;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    
    
    @Override
    public double getLuong() {
        return super.getSoGio()*heSo*100;
    }
    
    
    @Override
    public String toString(){
        return super.getMa()+"\t"+super.getHoTen()+"\t"+super.getSoGio()+"\t"+getLuong()+"\t"+soGioDM+"\t"+heSo;
    }
}
