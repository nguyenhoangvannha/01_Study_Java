/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class SerializeableFileFactory {
    public static boolean saveFile(ArrayList<KhachHang> dsKH, String path){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsKH);
            oos.close();
            fos.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeableFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerializeableFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static ArrayList<KhachHang> readFile(String path){
        FileInputStream fis;
        ArrayList<KhachHang> ds = new ArrayList<KhachHang>();
        try {
           
            fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<KhachHang>)ois.readObject();
            ois.close();
            fis.close();
            return ds;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeableFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerializeableFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerializeableFileFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
