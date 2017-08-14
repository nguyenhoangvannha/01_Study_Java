/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09.Other.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FileText {
    private static final String FILE_NAME = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\file_line.txt";
    public static void main(String[] args) {
        //writeFile("Hello file text");
        writeLine();
        System.out.println(readLine());
    }
    
    public static String readLine(){
        StringBuffer strB = new StringBuffer();
        
        FileReader fileR;
        try {
            fileR = new FileReader(FILE_NAME);
            BufferedReader bufferR = new BufferedReader(fileR);
            String line = null;
            while((line = bufferR.readLine()) != null){
                strB.append(line);
            }
        fileR.close();
        bufferR.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return strB.toString();
    }
    
    public static void writeLine(){
        FileWriter fileW;
        PrintWriter printW;
        try {
            
            fileW = new FileWriter(FILE_NAME,true);
            printW = new PrintWriter(fileW);
            
            printW.println("Java");
            printW.println("Android");
            fileW.close();
            printW.close();
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String readFile(){
        StringBuffer strB = new StringBuffer();
        try {
            FileReader fileR = new FileReader(FILE_NAME);
            int i = 0;
            while((i = fileR.read()) != -1){
                strB.append((char)i);   
            }
            fileR.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
        return strB.toString();
    }
    public static void writeFile(String data){
        try {
            FileWriter fileW = new FileWriter(FILE_NAME, true);
            fileW.write(data);
            fileW.close();
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
