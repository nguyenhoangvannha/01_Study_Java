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
public interface People {
    public void eat();
    public void go();
    
    //inner class - nested class
    interface Student{
        public void study();
    }
    
    public default void defaultAbstract(){
        System.out.println("Chap06.oop.adv.People.defaultAbstract()");
    }
    public static void staticAbstract(){
        System.out.println("Chap06.oop.adv.People.staticAbstract()");
    }
}
