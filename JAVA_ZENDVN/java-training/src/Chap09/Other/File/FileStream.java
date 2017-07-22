/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09.Other.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FileStream {
    private static final String FILE_NAME = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\file_stream.txt";
    public static void main(String[] args) {
        writeFile("item 01");
        System.out.println(readFile());
    }
    
    public static String readFile(){
        StringBuffer strB = new StringBuffer();
        try {
            FileInputStream fileIT = new FileInputStream(FILE_NAME);
            int i = 0;
            while((i = fileIT.read()) != -1){
                strB.append((char)i);
            }
            fileIT.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        return strB.toString();
    }
    public static void writeFile(String data){
        try {
            FileOutputStream fileOT = new FileOutputStream(FILE_NAME, false);
            fileOT.write(data.getBytes());
            
            fileOT.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
