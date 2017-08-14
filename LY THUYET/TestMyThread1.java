/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.basic;

import javax.swing.JFrame;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class TestMyThread1 extends JFrame{
    public TestMyThread1(){
        this.setSize(400,300);
        this.setLocation(500, 40);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        
        MyThread01 thread1 = new MyThread01();
        thread1.setName("Tien trinh 01");
        thread1.start();
        
        MyThread01 thread2 = new MyThread01();
        thread2.setName("Tien trinh 02");
        thread2.start();
    }
}
