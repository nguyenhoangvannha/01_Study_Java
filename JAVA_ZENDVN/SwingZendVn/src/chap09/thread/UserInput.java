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
public class UserInput extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 5; i ++){
            System.out.println("User input: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserInput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
