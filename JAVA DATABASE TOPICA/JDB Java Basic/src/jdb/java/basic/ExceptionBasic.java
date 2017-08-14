/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.basic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class ExceptionBasic {
    public static void main(String[] args) {
        try{
            int x = 1/0;
        } catch(Exception ex){
            //Xuat loi chi tiet
            ex.printStackTrace();
        }
    }
}
