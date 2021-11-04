package J04003;

import java.util.Scanner;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo() {
    }

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }
    
    public long getGCD(long tuSo,long mauSo){
        if(mauSo==0){
            return tuSo;
        }
        return getGCD(mauSo, tuSo%mauSo);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PhanSo ps=new PhanSo();
        ps.tuSo=sc.nextLong();
        ps.mauSo=sc.nextLong();
        long gcd=ps.getGCD(ps.tuSo, ps.mauSo);
        System.out.println((ps.tuSo/gcd)+"/"+(ps.mauSo/gcd));
    }
}
