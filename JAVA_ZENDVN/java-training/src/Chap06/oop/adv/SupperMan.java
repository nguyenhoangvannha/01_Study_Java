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
public class SupperMan extends Laptop implements People, Bird {

    @Override
    public void eat() {
        System.out.println("Chap06.oop.adv.SupperMan.eat()");
    }

    @Override
    public void go() {
        System.out.println("Chap06.oop.adv.SupperMan.go()");
    }

    @Override
    public void fly() {
        System.out.println("Chap06.oop.adv.SupperMan.fly()");
    }

    @Override
    public void mainboard() {
        System.out.println("Chap06.oop.adv.SupperMan.mainboard()");
    }
    
}
