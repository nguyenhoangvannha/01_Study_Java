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
public class ImplementsSuperMan implements InterfacePeople{

    @Override
    public void eat() {
        System.out.println("chap06.oopadv.ImplementsSuperMan.eat()");
    }

    @Override
    public void go() {
        System.out.println("chap06.oopadv.ImplementsSuperMan.go()");
    }
    
}
