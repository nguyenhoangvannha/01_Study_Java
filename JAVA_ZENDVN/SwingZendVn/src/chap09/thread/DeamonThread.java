/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap09.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class DeamonThread extends Thread {
    
    @Override
    public void run() {
        while(true){
            System.out.println("Deamon thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DeamonThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
