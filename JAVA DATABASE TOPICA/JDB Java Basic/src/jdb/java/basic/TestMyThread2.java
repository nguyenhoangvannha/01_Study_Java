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
public class TestMyThread2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread02());
        thread1.start();
        Thread thread2 = new Thread(new MyThread02());
        thread2.start();
        
    }
}
