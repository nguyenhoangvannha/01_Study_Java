/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap09.file;

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
    private static final String FILE_PATH = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\SwingZendVn\\src\\chap09\\file\\FilerandomAccess.txt";
    private static final String FOLDER_PATH = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\SwingZendVn\\src\\chap09\\file\\hello";
    public static void main(String[] args) {
        writeFile();
        readFile();
    }
    public static void readFile(){
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_PATH, "r");
            int result = randomAccessFile.readInt();
            
            System.out.println(result);
            
            
            System.out.println(randomAccessFile.readBoolean());
            
            System.out.println(randomAccessFile.readUTF());
            
            randomAccessFile.seek(0);
            
            randomAccessFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void writeFile(){
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_PATH, "rw");
            
            randomAccessFile.writeInt(423);
            randomAccessFile.writeBoolean(true);
            randomAccessFile.writeUTF("helloworld");
            
            randomAccessFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileRandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
