/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.basic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MyThread01 extends Thread{

    
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + "\ti = " + i);
        }
    }
    
}
