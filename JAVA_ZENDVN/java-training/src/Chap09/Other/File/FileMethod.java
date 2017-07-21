/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09.Other.File;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FileMethod {
    public static void main(String[] args) throws IOException {
        File fileObj = new File("E:\\workspace\\01_Study\\01_Study_Java\\JAVA_ZENDVN\\java-training\\src\\Chap09\\Other\\File\\HelloFile.txt");
        if(fileObj.exists()){
            System.out.println("Exist");
            System.out.println("getAbsolutePath:" + fileObj.getAbsolutePath());
        } else{
            System.out.println("Not exist");
            fileObj.createNewFile();
        }
    }
}
