/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap09.file;

import java.io.BufferedOutputStream;
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
    private static final String FOLDER_PATH = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\SwingZendVn\\src\\chap09\\file";
    private static final String FILE_NAME = FOLDER_PATH + "\\file_stream.txt";
    private static final String imageIn = FOLDER_PATH + "\\tkb.PNG";
    private static final String imageOut = FOLDER_PATH + "\\tkb_copy.PNG";
    public static void main(String[] args) {
        copyFile(imageIn, imageOut);
        
//        writeFile("HELLO WORLD 123");
//        System.out.println(readFile(FILE_NAME));
    }
    private static void copyFile(String fileIn,String fileOut){
        
        try {
            FileInputStream inputStream = new FileInputStream(fileIn);
            FileOutputStream outputStream = new FileOutputStream(fileOut);
                   
            int i = 0;
            while((i = inputStream.read()) != - 1){
                outputStream.write(i);
            }
            outputStream.close();
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static String readFile(String data){
        StringBuffer strB = new StringBuffer();
        try {
            FileInputStream inputStream = new FileInputStream(FILE_NAME);
            int c = 0;
            while((c = inputStream.read()) != -1){
                strB.append((char)c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        return strB.toString();
    }
    public static void writeFileWithBuffer(String data){
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME, false);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            bufferedOutputStream.write(data.getBytes());
            bufferedOutputStream.flush();
            
            bufferedOutputStream.close();
            outputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeFile(String data){
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME, false);
            outputStream.write(data.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
