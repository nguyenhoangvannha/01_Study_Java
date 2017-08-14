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
public class StrBasic {
    public static void main(String[] args) {
        compareTwoString();
    }
    public static void duThuaVungNho(){
        String str1 = "Memory 1"; //Vung nho thu nhat
        str1 = "Memory 2"; //Vung nho thu hai
        str1 = "Memory 3"; //Vung nho thu ba
        //Tao ra qua nhieu vung nho
    }
    //Compare two Strings with Equals and EqualsIgnoreCase
    public static void compareTwoString(){
        String str1 = "Android";
        String str2 = new String("android");
        System.out.println("Compare with case:" + str1.equals(str2));
        System.out.println("Compare without case:" + str1.equalsIgnoreCase(str2));
    }
    //Operator == actualy compare two vung nho
    public static void compareTwoStringPart1(){
        String str1 = "Java";
        String str2 = new String("Java");
        if(str1 == str2){
            System.out.println("Equal");
        } else{
            System.out.println("Not equal");
        }
        
    }
    public static void chuoiThanhSo(){
        String str1 = "2017";
        System.out.println(str1 + 1997);
        try{
            int number1 = Integer.parseInt(str1);
            System.out.println(number1 + 3);
        } catch(Exception ae){
            System.out.println("Error: " + ae.getMessage());
        }
        
    }
    public static void noiChuoi(){
        String str1 = "Java";
        String str2 = new String("Exception");
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);
        System.out.println(str1 + "\n+\n" + str2 + "\n=\n" + str3);
        System.out.println(str4);
    }
    public static void khaiBao(){
        String str1 = "Java basic";
        String str2 = new String();
        str2 = "Java Object oranted programing";
        String str3 = new String("Java Array");
        System.out.println(str1 + "\n" + str2 + "\n" + str3);
    }
}
