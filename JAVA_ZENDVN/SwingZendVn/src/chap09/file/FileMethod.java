/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap09.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FileMethod{
    private static final String FILE_PATH = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\SwingZendVn\\src\\chap09\\file\\hello.txt";
    private static final String FOLDER_PATH = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\SwingZendVn\\src\\chap09\\file\\hello";
 
    public static void main(String[] args) throws IOException {
        File fileObj = new File(FOLDER_PATH);
        if(fileObj.exists()){
            System.out.println("Folder ton tai\n" + fileObj.getAbsolutePath() + "\n" + fileObj.getName());
            System.out.println("Parent: " + fileObj.getParent());
            System.out.println("length:" + fileObj.length());
            System.out.println("canread - write:" + fileObj.canRead() + " - " + fileObj.canWrite());
//            Calendar car = fileObj.lastModified();
            Date dateObj = new Date(fileObj.lastModified());
            System.out.println("Last modifier:" + dateObj);
            System.out.println("is directory:" + fileObj.isDirectory());
            System.out.println("is file:" + fileObj.isFile());
            System.out.println("-------------------\n");
            File[] arrFile = fileObj.listFiles();
            for(Object elm: arrFile){
                System.out.println(elm);
            }
        } else{
            fileObj.createNewFile();
        }
    }
    public static void helloFolder(){
        File fileObj = new File(FOLDER_PATH);
        if(fileObj.exists()){
            System.out.println("Folder ton tai\n" + fileObj.getAbsolutePath() + "\n" + fileObj.getName());
            System.out.println("Parent: " + fileObj.getParent());
        } else{
            System.out.println("chap09.file.FileMethod.helloFolder()");
        }
    }
    public static void helloFile(){
        File fileObj = new File(FILE_PATH);
        if(fileObj.exists()){
            System.out.println("Folder ton tai\n" + fileObj.getAbsolutePath() + "\n" + fileObj.getName());
            System.out.println("Parent: " + fileObj.getParent());
            System.out.println("length:" + fileObj.length());
            System.out.println("canread - write:" + fileObj.canRead() + " - " + fileObj.canWrite());
//            Calendar car = fileObj.lastModified();
            Date dateObj = new Date(fileObj.lastModified());
            System.out.println("Last modifier:" + dateObj);
            System.out.println("is directory:" + fileObj.isDirectory());
            System.out.println("is file:" + fileObj.isFile());
        } else{
            try {
                fileObj.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FileMethod.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
