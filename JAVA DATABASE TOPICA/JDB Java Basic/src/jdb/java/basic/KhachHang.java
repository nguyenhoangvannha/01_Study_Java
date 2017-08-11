/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.basic;

import java.io.Serializable;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class KhachHang implements Serializable, Comparable<KhachHang>{
    private int ma;
    private String hoTen;
    private String soDienThoai;
    
    public KhachHang(){
        
    }
    
    public KhachHang(int ma, String hoTen, String soDienThoai){
        this.ma = ma;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "Ma: " + this.ma + "\tHo va ten: " + this.hoTen + "\tSo dien thoai: " + this.soDienThoai;
    }
    
    
    
    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        this.ma = ma;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the soDienThoai
     */
    public String getSoDienThoai() {
        return soDienThoai;
    }

    /**
     * @param soDienThoai the soDienThoai to set
     */
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.soDienThoai.compareTo(o.getSoDienThoai());
    }
    
}
