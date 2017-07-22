/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09.Others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class RePattem {
    public static void main(String[] args) {
        study005();
    }
    
    public static void study005(){
        String input = "java--what-the-----fffucckk--";
        Pattern pt = Pattern.compile("-+");
        Matcher mc = pt.matcher(input);
        while(mc.find()){
            System.out.printf("start %s \n end: %s \n group: %s \n", mc.start(), mc.end(), mc.group());
        }
    }
    
    //lookingAt
    public static void study004(){
        String input = "javaandroid";
        Pattern pt = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
        Matcher mc = pt.matcher(input);
        if(mc.matches()){
            System.out.println("Hop le roi");
        } else{
            System.out.println("Khong hop le roi");
        }
        if(mc.lookingAt()){
            System.out.println("Hop le roi");
        } else{
            System.out.println("Khong hop le roi");
        }
    }
    
    //matche.replaceAll
    public static void study003(){
        String input = "Java kho bo me";
        Pattern pt = Pattern.compile("\\s+");
        Matcher mc = pt.matcher(input);
        System.out.println(mc.replaceAll("\t"));
    }
    
    //CASE_INSENSITIVE reset
    public static void study002(){
        String input = "zend.VN";
        Pattern pattern = Pattern.compile("zend.vn", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        
        if(matcher.matches()){
            System.out.println("Du lieu hop le");
        } else{
            System.out.println("Khong hop le");
        }
        String input2 = "ZEND.vn";
        matcher.reset(input2);
    }
    
    //partem + matches
    public static void study001() {
        String input = "abc4d_";
        
        //method 1
        if(input.matches("[A-z_]+")){
            System.out.println("Hop le");
        } else {
            System.out.println("Khong hop le");
        }
        
        //method 2
        Pattern pattern = Pattern.compile("[A-z0-9_]+");
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("Hop le");
        } else {
            System.out.println("Khong hop le");
        }
        
        //method 3
        if(Pattern.matches("[A-z0-9_]+", input)){
            System.out.println("Hop le");
        } else {
            System.out.println("Khong hop le");
        }
    }
}
