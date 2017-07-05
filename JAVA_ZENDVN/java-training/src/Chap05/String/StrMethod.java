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
public class StrMethod {
    public static void main(String[] args) {
        
        lengthStr();
        charAtStr();
        toLowerCaseStr();
        toUperCaseStr();
        trimStr();
        substringStr();
    }
    
    public static void substringStr(){
        String str1 = new String("Java home");
        String str2 = str1.substring(0, 04);
        System.out.println("Ogrinal:" + str1);
        System.out.println("substring:" + str2);
    }
    
    //trim()
    public static void trimStr(){
        String str1 = new String();
        str1 = "   khoang     trong not de lai   ";
        System.out.println(str1);
        str1 = str1.trim();
        System.out.println("trim:" + str1);
    }
    
    //toUperCase()
    public static void toUperCaseStr(){
        String str1 = new String("Nguyen hoang van Nha");
        System.out.println("Normal:" + str1);
        System.out.println("toUperCase:" + str1.toUpperCase());
    }
    
    //toLowerCase()
    public static void toLowerCaseStr(){
        String str1 = new String("Nguyen Hoang Van Nha");
        System.out.println("Normal:" + str1);
        System.out.println("toLowerCase:" + str1.toLowerCase());
    }
    
    //charAt()
    public static void charAtStr(){
        String str1 = new String("Java is a programing language.");
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(str1.length() - 1));
    }
    
    //length() 
    public static void lengthStr(){
        String str1 = new String("Java");
        System.out.println(str1.length());
    }
}
