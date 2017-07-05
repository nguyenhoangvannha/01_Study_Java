/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap05.String;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class StrBuilder {
    public static void main(String[] args) {
        
        //init stringbuilder
        StringBuilder strbd1 = new StringBuilder("Java");
        System.out.println(strbd1 + "\nLength: " + strbd1.length());
        
        //append: add to the end of string
        strbd1.append(" is a language");
        System.out.println(strbd1 + "\nLength: " + strbd1.length());
        
        //insert: insert another string at position
        strbd1.insert(10, "programing ");
        System.out.println(strbd1 + "\nLength: " + strbd1.length());
        
        //deleteCharAt
        strbd1.deleteCharAt(0);
        System.out.println(strbd1 + "\nLength: " + strbd1.length());
        
        //delete 
        strbd1.delete(0, 3);
        System.out.println(strbd1 + "\nLength: " + strbd1.length());
    }
}
