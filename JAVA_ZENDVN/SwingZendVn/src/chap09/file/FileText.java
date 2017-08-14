/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap09.file;

import java.io.BufferedWriter;
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
    private static final String FOLDER_PATH = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\SwingZendVn\\src\\chap09\\file";
//    private static final String FILE_NAME = FOLDER_PATH + "\\file_text.txt";
    private static final String FILE_NAME = FOLDER_PATH + "\\file_line.txt";
    
    public static void main(String[] args) {
//        writeFile("Hello world\n");
        writeLineFile();
        readFile();
        
    }
    public static void readFile(){
        StringBuffer buffer = new StringBuffer();
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            int i = 0;
            while((i = fileReader.read()) != -1){
                buffer.append((char)i);
            }
            System.out.println(buffer.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void writeLineFile(){
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Java");
            printWriter.println("Zendvn");
            printWriter.println("Day");
            printWriter.println("Ngu");
            
            printWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeFile(String data){
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME, true);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
