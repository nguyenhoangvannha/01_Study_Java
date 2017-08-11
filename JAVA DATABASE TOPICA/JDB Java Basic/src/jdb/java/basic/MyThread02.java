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
public class MyThread02 implements Runnable {

    @Override
    public void run() {
        for(int j = 0; j < 5; j++){
            System.out.println(Thread.currentThread().getName() + "\tj=" + j);
        }
    }
    
}
