/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09.Other.File;

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
    private static final String FILE_NAME = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\ExeFileRandomAccess.dat";
    //private static final String FILE_NAME = "HelloFile.txt";
    private static final String FOLDER_NAME = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\";
    private static String name = null;
    private static int score = 0;
    
    public static void main(String[] args) {
       
        //userInput();
        //writeFile(name,score);
        //readFile();
        listItems();
    }
    
    public static void listItems(){
            
            try {
                RandomAccessFile randomAF = new RandomAccessFile(FILE_NAME, "r");
                for(int i = 0; i < 3; i++){
                    System.out.println("Name:" + randomAF.readUTF());
                    System.out.println("Score:" + randomAF.readInt());
                }
               randomAF.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public static void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        name = sc.next();
        sc.nextLine();
        System.out.println("Score:");
        score = sc.nextInt();
        sc.close();
    }
    public static void writeFile(String name, int score){
        try {
            RandomAccessFile randomAF = new RandomAccessFile(FILE_NAME, "rw");
            randomAF.seek(randomAF.length());
            randomAF.writeUTF(name);
            randomAF.writeInt(score); 
            randomAF.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readFile(){
        try {
            RandomAccessFile randomAF = new RandomAccessFile("FILE_NAME","rw");
            System.out.println("Name: " + randomAF.readUTF());
            System.out.println("Score: " + randomAF.readInt());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExeFileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
