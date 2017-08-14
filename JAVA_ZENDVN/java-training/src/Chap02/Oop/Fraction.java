/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap02.Oop;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    
    public Fraction(int numerator,int denominator){
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }
    
    private int UCLN(int A,int B){
        int r;
        while(B!=0){
            r = A%B;
            A= B;
            B = r;
        }
        return A;
    }
    public static Fraction add(Fraction A,Fraction B){
        Fraction result = new Fraction((A.getNumerator()*B.getDenominator() + B.getNumerator()*A.getDenominator()),(A.getDenominator()*B.getDenominator()));
        //result.setNumerator(A.getNumerator()*B.getDenominator() + B.getNumerator()*A.getDenominator());
        return result;
    }
    
    public static Fraction sub(Fraction A,Fraction B){
        Fraction result = new Fraction((A.getNumerator()*B.getDenominator() - B.getNumerator()*A.getDenominator()),(A.getDenominator()*B.getDenominator()));
        return result;
    }
    public static Fraction multiply(Fraction A,Fraction B){
        Fraction result = new Fraction(A.getNumerator()*B.getNumerator(), A.getDenominator()*B.getDenominator());
        return result;
    }
    public static Fraction divide(Fraction A,Fraction B){
        Fraction result = new Fraction(A.getNumerator()*B.getDenominator(), B.getNumerator()*A.getDenominator());
        return result;
    }   
    public String print(){
        return this.getNumerator() + "/" + this.getDenominator();
    }
    
    public void normalize(){
        int ucln = this.UCLN(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator()/ucln);
        this.setDenominator(this.getDenominator()/ucln);
    }
    /**
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
