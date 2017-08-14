/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic.QuanLyNV.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class PhongBan implements Serializable{
    private String maPhong;
    private String tenPhong;
    private Vector<NhanVien> dsNhanVien;
    public PhongBan(){
        dsNhanVien = new Vector<>();
    }
    
    public void themNhanVien(NhanVien nv){
        this.dsNhanVien.add(nv);
        nv.setPhong(this);
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.tenPhong;
    }
    
    
    /**
     * @return the maPhong
     */
    public String getMaPhong() {
        return maPhong;
    }

    /**
     * @param maPhong the maPhong to set
     */
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    /**
     * @return the tenPhong
     */
    public String getTenPhong() {
        return tenPhong;
    }

    /**
     * @param tenPhong the tenPhong to set
     */
    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    /**
     * @return the dsNhanVien
     */
    public Vector<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    /**
     * @param dsNhanVien the dsNhanVien to set
     */
    public void setDsNhanVien(Vector<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }
    
}
