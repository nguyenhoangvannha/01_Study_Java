/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09.Other.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FileRandomAccess {
    private static final String FILE_NAME = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\FileRandomAccess.txt";
    //private static final String FILE_NAME = "HelloFile.txt";
    private static final String FOLDER_NAME = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\";
    public static void main(String[] args) {
        writeFile();
        readFile();
    }
    
    //read file
    public static void readFile(){
        try {
            RandomAccessFile randomAF = new RandomAccessFile(FILE_NAME, "r");
            try {
                System.out.println("" + randomAF.readInt());
                System.out.println("" + randomAF.readBoolean());
                System.out.println("" + randomAF.readUTF());
            } catch (IOException ex) {
                Logger.getLogger(FileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    //write file
    public static void writeFile(){
        try {
            RandomAccessFile randomAF = new RandomAccessFile(FILE_NAME, "rw");
            try {
                randomAF.writeInt(2017);
                randomAF.writeBoolean(true);
                randomAF.writeUTF("RandomAccessFile");
            } catch (IOException ex) {
                Logger.getLogger(FileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
