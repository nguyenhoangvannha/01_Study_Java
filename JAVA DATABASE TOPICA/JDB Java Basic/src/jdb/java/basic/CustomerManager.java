/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CustomerManager {
    private static Scanner sc = new Scanner(System.in);
    private static final String savePath = "E:\\customerData.db";
    private static byte showMenu(){
        byte chon = 0;
        System.out.println("===============Quan tri vien===============");
        System.out.println("1.Nhap khach hang.");
        System.out.println("2.Xuat khach hang.");
        System.out.println("3.Tim kiem khach hang.");
        System.out.println("4.Sap xep khach hang.");
        System.out.println("5.Luu File.");
        System.out.println("6.Doc File.");
        System.out.println("7.Thong ke theo nha mang.");
        System.out.println("8.Thoat.");
        System.out.println("=====Chon: ");
        chon = sc.nextByte();
        return chon;
    }
    private static byte showMenu02(){
        byte chon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("===============Quan tri vien===============");
        System.out.println("1.Nhap khach hang");
        System.out.println("2.Xuat khach hang");
        System.out.println("3.Luu khach hang");
        System.out.println("4.Tim");
        System.out.println("5.Sap xep");
        System.out.println("6.Luu");
        System.out.println("7.Doc File");
        System.out.println("8.Thoat phan mem");
        chon = sc.nextByte();
        return chon;
    }
        
    private static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
    public static void main(String[] args) {
        byte chon = 0;
        do{
            chon = showMenu();
            switch(chon){
                case 1:
                    nhapKH();
                    break;
                case 2:
                    xuatKH();
                    break;
                case 3:
                    timKH();
                    break;
                case 4:
                    sapxepKH();
                    break;
                case 5:
                    luuKH();
                    break;
                case 6:
                    docKH();
                    break;
                case 7:
                    thongKe();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban chon sai, moi chon lai!");
            }
        } while(chon != 8);
    }

    private static void nhapKH() {
        System.out.println("So luong khach hang ban muon nhap: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap KH thu " + i + " :");
            System.out.println("-Ma KH: ");
            int ma = sc.nextInt();
            sc.nextLine();
            System.out.println("-Ho va ten KH: ");
            String hoTen = sc.nextLine();
            System.out.println("-So dien thoai KH: ");
            String soDienThoai = sc.nextLine();
            KhachHang kh = new KhachHang(ma, hoTen, soDienThoai);
            dsKH.add(kh);
        }
    }

    private static void xuatKH() {
        System.out.println("=== Danh sach khach hang: ");
        System.out.println("Ma KH\tHo va ten KH\tSo dien thoai KH");
        for(KhachHang kh: dsKH){
            System.out.println(kh);
        }
    }

    private static void timKH() {
        String soDienThoai = "090";
        for(KhachHang kh: dsKH){
            if(kh.getSoDienThoai().startsWith(soDienThoai)){
                System.out.println(kh);
            }
        }
        
    }

    private static void sapxepKH() {
        Collections.sort(dsKH);
    }

    private static void luuKH() {
        if(SerializeableFileFactory.saveFile(dsKH, savePath)){
            System.out.println("Luu file thanh cong");
        } else{
            System.out.println("Luu file khong thanh cong");
        }
    }

    private static void docKH() {
        dsKH = SerializeableFileFactory.readFile(savePath);
        
    }

    private static void thongKe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
