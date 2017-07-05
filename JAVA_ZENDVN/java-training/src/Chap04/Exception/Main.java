/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap04.Exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Main {
    public static void main(String[] args) {
        try {
            myFunction(3, 0);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            System.out.println("Always show");
        }
    }
    public static void myFunction(int a,int b) throws ArithmeticException, Exception{
        if(b == 0) throw new ArithmeticException("Loi chia cho khong");
        System.out.println(a/b);
    }
    public static void chiaChoKhong(){
        try{
            System.out.println(5/0);
        } catch(Exception e){
            System.out.println("Error:" + e.toString());
        }
        
    }
}
