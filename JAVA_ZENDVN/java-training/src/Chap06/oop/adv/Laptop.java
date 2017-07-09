/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06.oop.adv;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
abstract public class Laptop {
    public static void keyboard(){
        System.out.println("Chap06.oop.adv.Laptop.keyboard()");
    }
    abstract public void mainboard();
    public static void chipset(){
        System.out.println("Chap06.oop.adv.Laptop.chipset()");
    }
}
