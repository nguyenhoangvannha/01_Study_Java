/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap09.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class ExeFileRandomAccess {
    private static final String FOLDER_PATH = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\SwingZendVn\\src\\chap09\\file";
    private static final String FILE_NAME = FOLDER_PATH + "\\exe_file_randomaccess.dat";
    private static RandomAccessFile accessFile;
    private static String name = null;
    private static int score = 0;
    public static void main(String[] args) {
//        userInput();
//        writeFile(name,score);
        listItems(FILE_NAME);
        System.out.println("===============================");
//        getItems("thang sau");
        updateItem("thang truoc", 888);
        listItems(FILE_NAME);
    }
    private static void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tem:");
        name = sc.nextLine();
        System.out.println("Nhap diem: ");
        score = sc.nextInt();
        sc.close();
    }
    public static void writeFile(String name, int score){
        try { 
            accessFile = new RandomAccessFile(FILE_NAME, "rw");
            accessFile.seek(accessFile.length());
            accessFile.writeUTF(name);
            accessFile.writeInt(score);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void updateItem(String strName, int newScore){
        try {
            accessFile = new RandomAccessFile(FILE_NAME,"rw");
            while(accessFile.getFilePointer() != accessFile.length()){
                name = accessFile.readUTF();
                if(name.equals(strName)){
                    accessFile.writeInt(newScore);
                } else score = accessFile.readInt();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void getItems(String strName){
        try {
            accessFile = new RandomAccessFile(FILE_NAME,"r");
            while(accessFile.getFilePointer() != accessFile.length()){
                name = accessFile.readUTF();
                score = accessFile.readInt();
                if(name.equals(strName)){
                    System.out.println("Name: "+ name + "\tScore: " + score);
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listItems(String fileName){
        try {
            accessFile = new RandomAccessFile(fileName,"r");
            System.out.println("Size: " + accessFile.length());
            while(accessFile.getFilePointer() != accessFile.length()){
                System.out.println("Poiter start:" + accessFile.getFilePointer());
                name = accessFile.readUTF();
                score = accessFile.readInt();
                System.out.println("Name: "+ name + "\tScore: " + score);
                System.out.println("Poiter end:" + accessFile.getFilePointer());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void readFile(String fileName){
        try {
            accessFile = new RandomAccessFile(fileName,"r");
            name = accessFile.readUTF();
            score = accessFile.readInt();
            
            System.out.println("Name: "+ name + "\tScore: " + score);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
