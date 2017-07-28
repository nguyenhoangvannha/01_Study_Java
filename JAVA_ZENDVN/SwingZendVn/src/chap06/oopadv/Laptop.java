/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap06.oopadv;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
abstract public class Laptop {
    abstract public void mainBoard();
    public void keyBoard(){
        System.out.println("chap06.oopadv.Laptop.keyboard()");
    }
    public void chipSet(String name){
        System.out.println("chap06.oopadv.Laptop.chipSet()");
    }
}
