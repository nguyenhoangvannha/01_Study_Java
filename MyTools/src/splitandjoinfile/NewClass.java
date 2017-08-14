/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitandjoinfile;

import java.io.File;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class NewClass {
    private static String path = "E:\\DS Trung tuyen D1.pdf";
    public static void main(String[] args) {
        String nameIn = "hello . world.part192";
        String result[] = nameIn.split("\\.part\\d+");
        System.out.println(result[0]);
    }
    
}
