/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap05.String;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class StrSplit {
    public static void main(String[] args) {
        stringTokenizerStr();
    }
    
    //StringTokenizer
    //Not support Agular Expression
    public static void stringTokenizerStr(){
        String str1 = new String("One two three four five six");
        String str2 = "One-two-three-four-five-six";
        String str3 = new String();
        str3 = "One two-three-four five six";
        String str4 = new String("One12two  three four938 five 9 six");
        //StringTokenizer stkObj = new StringTokenizer(str1);
        //StringTokenizer stkObj = new StringTokenizer(str2, "-");
        //StringTokenizer stkObj = new StringTokenizer(str3, "[- ]");
        StringTokenizer stkObj = new StringTokenizer(str4);
        while(stkObj.hasMoreTokens()){
            String token = stkObj.nextToken();
            System.out.printf("|%s|\n", token);
        }
        
    }
    
    //split method
    public static void splitStr(){
        String str1 = new String("One two three four five six");
        String str2 = "One-two-three-four-five-six";
        String str3 = new String();
        str3 = "One two-three-four five six";
        String str4 = new String("One12two  three four938 five 9 six");
        //String arrStr[] = str1.split(" ");
        //String arrStr[] = str2.split("-");
        //String arrStr[] = str3.split("[- ]");
        String arrStr[] = str4.split("( *[0-9]{1,} *| +)");
        System.out.println(arrStr.length);
        for(String elm : arrStr){
            System.out.printf("|%s|",elm);
        }
    }
    
    //Scanner split with number
    public static void scannerSplitV4(){
        String str = new String("Scanner 12 split 535 with  number55and 434space");
        Scanner sc = new Scanner(str);
        sc.useDelimiter("( *[0-9]{1,} *| +)");
        while(sc.hasNext()){
            String token = sc.next();
            System.out.printf("|%s|\n",token);
        }
        sc.close();
    }
    
    //Scanner split with "-" and space
    public static void scannerSplitV3(){
        String str = new String("Scanner-split-with space-and more");
        Scanner sc = new Scanner(str);
        //sc.useDelimiter("(\\-| )");
        sc.useDelimiter("[ -]");
        while(sc.hasNext()){
            String token = sc.next();
            System.out.printf("|%s|",token);
        }
        sc.close();
    }
    
    //Scanner split with "-"
    public static void scannerSplitV2(){
        String str = "Java-programing-language";
        Scanner sc = new Scanner(str);
        sc.useDelimiter("-");
        while(sc.hasNext()){
            String token = sc.next();
            System.out.printf("|%s|",token);
        }
        sc.close();
    }
    
    //Scanner split with space
    public static void scannerSplit(){
        String str = new String("Java developer and research");
        System.out.println("Stock:" + str);
        Scanner sc = new Scanner(str);
        while(sc.hasNext()){
            String token = sc.next();
            System.out.printf("|%s|", token);
        }
        sc.close();
    }
}
