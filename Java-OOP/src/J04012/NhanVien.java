
package J04012;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private int luong;
    private int soNC;
    private String chucVu;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int luong, int soNC, String chucVu) {
        this.maNV = "NV01";
        this.hoTen = hoTen;
        this.luong = luong;
        this.soNC = soNC;
        this.chucVu = chucVu;
    }
    
    public int luongThang(){
        return luong*soNC;
    }
    
    public int thuong(){
        if(soNC>=25){
            return (int) (luongThang()*0.2);
        }
        else if(soNC>=22){
            return (int) (luongThang()*0.1);
        }
        else{
            return 0;
        }
    }
    
    public int phuCap(){
        if(chucVu.equals("GD")){
            return 250000;
        }
        else if(chucVu.equals("PGD")){
            return 200000;
        }
        else if(chucVu.equals("TP")){
            return 180000;
        }
        else{
            return 150000;
        }
    }
    
    public int thuNhap(){
        return luongThang()+thuong()+phuCap();
    }
    
    @Override
    public String toString(){
        return maNV+" "+hoTen+" "+luongThang()+" "+thuong()+" "+phuCap()+" "+thuNhap();
    }
}
