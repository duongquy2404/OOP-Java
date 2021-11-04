package J05005;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV;
    private String hoTen;
    private Date dob;
    private String lop;
    private float gpa;

    public SinhVien() {
    }
    
    public SinhVien(int index, String hoTen, String lop, String dob, float gpa) throws ParseException {
        this.maSV = "B20DCCN"+String.format("%03d", index);
        this.hoTen = chuanHoa(hoTen);
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.lop = lop;
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f", maSV,hoTen,lop,new SimpleDateFormat("dd/MM/yyyy").format(dob),gpa);
    }
    
    private String chuanHoa(String hoTen){
        hoTen=hoTen.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] str=hoTen.split(" ");
        hoTen="";
        for (int i = 0; i < str.length; i++) {
                hoTen += String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1);
                if (i < str.length - 1)
                    hoTen += " ";
            }
        return hoTen;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.gpa>o.gpa) return -1;
        if(this.gpa<o.gpa) return 1;
        return 0;
    }
}
