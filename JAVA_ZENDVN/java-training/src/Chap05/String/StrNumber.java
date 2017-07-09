/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap05.String;

import java.util.Scanner;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class StrNumber {
    public static void main(String[] args) {
        numberToStr();
    }
    
   /*Ứng dụng đọc số có 3 chữ số
    • 976 = Chín trăm bảy mươi sáu
    • 206 = Hai trăm linh sáu
    • 115 = Một trăm mười lăm
    • 291 = Hai trăm chín mươi mốt
    */
    public static void numberToStr(){
        System.out.println("Input:");
        StringBuilder strout = new StringBuilder();
        
        try (Scanner sc = new Scanner(System.in)) {
            String strin = sc.nextLine();
            String[] arrStr = strin.split("");
            for(int i =0; i < arrStr.length; i++){
                String temp = "";
                switch(arrStr[i]){
                    case "0": temp = "không "; break;
                    case "1": temp = "một "; break;
                    case "2": temp = "hai "; break;
                    case "3": temp = "ba "; break;
                    case "4": temp = "bốn "; break;
                    case "5": temp = "năm "; break;
                    case "6": temp = "sáu "; break;
                    case "7": temp = "bảy "; break;
                    case "8": temp = "tám "; break;
                    case "9": temp = "chín "; break;
                }
                if(i == 0){
                    temp += "trăm ";
                } else{
                    if(i == 1){
                        temp += "mươi ";
                    }
                }
                strout.append(temp);
            }
        } catch(Exception ex){
            System.out.println("ERROR:" + ex.getMessage().toUpperCase());
        }
        
        System.out.printf("|%s|", strout);
    }
}
