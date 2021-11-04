package J04004;

import java.util.Scanner;

public class TongPhanSo {
    private long tuSo1;
    private long mauSo1;
    private long tuSo2;
    private long mauSo2;

    public TongPhanSo() {
    }

    public TongPhanSo(long tuSo1, long mauSo1, long tuSo2, long mauSo2) {
        this.tuSo1 = tuSo1;
        this.mauSo1 = mauSo1;
        this.tuSo2 = tuSo2;
        this.mauSo2 = mauSo2;
    }

    public long getTuSo1() {
        return tuSo1;
    }

    public void setTuSo1(long tuSo1) {
        this.tuSo1 = tuSo1;
    }

    public long getMauSo1() {
        return mauSo1;
    }

    public void setMauSo1(long mauSo1) {
        this.mauSo1 = mauSo1;
    }

    public long getTuSo2() {
        return tuSo2;
    }

    public void setTuSo2(long tuSo2) {
        this.tuSo2 = tuSo2;
    }

    public long getMauSo2() {
        return mauSo2;
    }

    public void setMauSo2(long mauSo2) {
        this.mauSo2 = mauSo2;
    }
    
    public long getGCD(long tuSo,long mauSo){
        if(mauSo==0){
            return tuSo;
        }
        return getGCD(mauSo, tuSo%mauSo);
    }
    
    /*public void display(){
        long tuSo=tuSo1*mauSo2+tuSo2*mauSo1;
        long mauSo=mauSo1*mauSo2;
        long gcd=getGCD(tuSo, mauSo);
        System.out.prlongln((tuSo/gcd)+"/"+(mauSo/gcd));
    }*/
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TongPhanSo tps=new TongPhanSo(sc.nextLong(),sc.nextLong(),sc.nextLong(),sc.nextLong());
        long tuSo=tps.tuSo1*tps.mauSo2+tps.tuSo2*tps.mauSo1;
        long mauSo=tps.mauSo1*tps.mauSo2;
        long gcd=tps.getGCD(tuSo, mauSo);
        System.out.println((tuSo/gcd)+"/"+(mauSo/gcd));
    }
}
