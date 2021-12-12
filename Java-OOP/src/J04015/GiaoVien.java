
package J04015;

public class GiaoVien {
    private String maGV;
    private String hoTen;
    private int luong;

    public GiaoVien() {
    }

    public GiaoVien(String maGV, String hoTen, int luong) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    
    public int bacLuong(){
        return Integer.parseInt(String.valueOf(maGV.charAt(2)))*10+Integer.parseInt(String.valueOf(maGV.charAt(3)));
    }
    
    public int phuCap(){
        String tmp=maGV.substring(0,2);
        if(tmp.equals("HT")){
            return 2000000;
        }
        else if(tmp.equals("HP")){
            return 900000;
        }
        else{
            return 500000;
        }
    }
    
    public int thuNhap(){
        return luong*bacLuong()+phuCap();
    }
    
    @Override
    public String toString(){
        return maGV+" "+hoTen+" "+bacLuong()+" "+phuCap()+" "+thuNhap();
    }
}
