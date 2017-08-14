/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap02.oopbasic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Fraction {
    private int tu;
    private int mau;
    public Fraction(){
        tu = 0;
        mau = 0;
    }

    @Override
    public String toString() {
        return this.getTu() + "/" + this.getMau();
    }
    public static Fraction mul(Fraction fr1, Fraction fr2){
        Fraction result = new Fraction();
        result.setTu(fr1.getTu()*fr2.getTu());
        result.setMau(fr1.getMau()*fr2.getMau());
        result = toiGianPhanSo(result);
        return result;
    }
    public static Fraction div(Fraction fr1, Fraction fr2){
        Fraction result = new Fraction();
        result.setTu(fr1.getTu()*fr2.getMau());
        result.setMau(fr1.getMau()*fr2.getTu());
        result = toiGianPhanSo(result);
        return result;
    }
    public static Fraction sub(Fraction fr1, Fraction fr2){
        Fraction result = new Fraction();
        result.setTu(fr1.getTu()*fr2.getMau() - fr2.getTu()*fr1.getMau());
        result.setMau(fr1.getMau()*fr2.getMau());
        result = toiGianPhanSo(result);
        return result;
    }
    public static Fraction add(Fraction fr1, Fraction fr2){
        Fraction result = new Fraction();
        result.setTu(fr1.getTu()*fr2.getMau() + fr2.getTu()*fr1.getMau());
        result.setMau(fr1.getMau()*fr2.getMau());
        result = toiGianPhanSo(result);
        return result;
    }
    public static Fraction toiGianPhanSo(Fraction fr){
        Fraction result = fr;
        int ucln = UCLN(fr.getTu(),fr.getMau());
        if(ucln != 1 && ucln <= Math.min(fr.getTu(), fr.getMau())){
            result.setTu(fr.getTu()/ucln);
            result.setMau(fr.getMau()/ucln);
        }
        return result;
    }
    public static int UCLN(int a, int b){
        int r = 0;
        do{
          r = a%b;
          a = b;
          b = r;
        } while(b!=0);
        return a;
    }
    /**
     * @return the tu
     */
    public int getTu() {
        return tu;
    }

    /**
     * @param tu the tu to set
     */
    public void setTu(int tu) {
        this.tu = tu;
    }

    /**
     * @return the mau
     */
    public int getMau() {
        return mau;
    }

    /**
     * @param mau the mau to set
     */
    public void setMau(int mau) {
        this.mau = mau;
    }
}
