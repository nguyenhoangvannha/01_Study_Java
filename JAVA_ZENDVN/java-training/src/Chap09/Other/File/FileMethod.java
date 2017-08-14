/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09.Other.File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FileMethod {
    private static final String FILE_NAME = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\HelloFile.txt";
    //private static final String FILE_NAME = "HelloFile.txt";
    private static final String FOLDER_NAME = "E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\";
    public static void main(String[] args) throws IOException {
        File fileObj = new File(FOLDER_NAME);
        if(fileObj.exists()){
            System.out.println("Exist");
            System.out.println("isDirectory: " + fileObj.isDirectory());
            System.out.println("isFile: " + fileObj.isFile());
            System.out.println("getAbsolutePath:" + fileObj.getAbsolutePath());
            System.out.println("getParents: " + fileObj.getParent());
            System.out.println("canRead: " + fileObj.canRead());
            System.out.println("canWrite: " + fileObj.canWrite());
            System.out.println("length: " + fileObj.length());
            
            System.out.println("lastModified: " + fileObj.lastModified());
            Date dateObj = new Date(fileObj.lastModified());
            System.out.println("lastModified: " + dateObj);
            
            if(fileObj.delete()){
                System.out.println("Delete successfully");
            }
            System.out.println("=================================");
            File[] listFiles = fileObj.listFiles();
            System.out.println("" + listFiles.length);
            for(int i = 0; i < listFiles.length; i++){
                File fileTemp = listFiles[i];
                System.out.println(fileTemp.getName());
            }
        } else{
            System.out.println("Not exist");
            fileObj.createNewFile();
        }
    }
}
