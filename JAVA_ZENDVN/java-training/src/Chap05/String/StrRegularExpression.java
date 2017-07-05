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
public class StrRegularExpression {
    public static void main(String[] args) {
        kiemTraUserName();
    }
    
    //Kiem tra dia chi website hop le
    public static void kiemTraDiaChiWeb(){
        String inputStr = "";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Input website address:");
            inputStr = sc.nextLine();
        } while(!inputStr.matches("(https?://(www\\.)?|(www\\.))[A-z0-9\\-]{3,}((A-z){2,4}){1,2}"));
        
        sc.close();
    }
    
    //Kiem tra username hop le
    public static void kiemTraUserName(){
        String inputStr = "";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Input username:");
            inputStr = sc.nextLine();
        }while(!inputStr.matches("[A-z_][\\w\\.]{4,31}"));
        
        sc.close();
    }
    
    //Kiem tra ID hop le
    public static void kiemTraID(){
        String inputIDStr ="";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Input ID:");
            inputIDStr = sc.nextLine();
            
        }while(!inputIDStr.matches("[A-z]{3}-[2-8]{3}"));
        
        sc.close();
    }
    
    //Kiem tra du lieu nhap vao co phai la so tu nhien (0<100) hay khong
    public static void kiemTrasoTuNhien(){
        boolean flagmatch = false;
        String inputStr = "";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Input:");
            inputStr = sc.nextLine();
            if(inputStr.matches("[0-9]{1,2}")){
                flagmatch = true;
                System.out.println("True!");
            }
        }while(flagmatch == false);
        sc.close();
    }
}
