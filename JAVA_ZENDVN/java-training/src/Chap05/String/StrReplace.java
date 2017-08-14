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
public class StrReplace {
    public static void main(String[] args) {
        replaceAllStrV2();
    }
    
    //replaceAll
    public static void replaceAllStrV2(){
        String str = new String("Ja3va pr23ograming la426ng6uage.");
        System.out.println("Orginal:" + str);
        //str = str.replaceAll("[^0-9]", ""); //Method 1
        str = str.replaceAll("\\D", "");
        System.out.println("Orginal:" + str);
    }
    
    //replaceAll("regular expression", replacemant)
    public static void replaceAllStr(){
        String str = new String("Ja3va pr23ograming la426ng6uage.");
        System.out.println("Orginal:" + str);
        str = str.replaceAll("[0-9]+", "");
        System.out.println("Orginal:" + str);
    }
    
    //replace(old symbol,new symbol) a symbol
    public static void replaceStr(){
        String str = new String("Java programing language.");
        System.out.println("Orginal:" + str);
        str = str.replace("a", "F");
        System.out.println("Custumed: " + str);
    }
}
