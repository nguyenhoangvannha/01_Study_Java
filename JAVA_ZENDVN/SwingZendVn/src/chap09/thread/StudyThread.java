/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap09.thread;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class StudyThread {
    private static boolean running = true;
    public static void main(String[] args) {
        main005();
        Scanner scanner = new Scanner(System.in);
        String input = null;
        System.out.println("Input s to stop");
        input = scanner.nextLine();
        scanner.close();
        
        if(input.equalsIgnoreCase("s")){
            setRunning(false);
        }
//        for(int i = 0; i < 5; i++){
//            System.out.println("Main: " + i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(StudyThread.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
    public static void main005(){
        Sleep sleep = new Sleep();
        sleep.start();
    }
    public static void main004(){
        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setDaemon(true);
        deamonThread.start();
    }
    public static void main003(){
        CheckSpelling checkSpelling = new CheckSpelling();
        checkSpelling.run();
    }
    public static void main002(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i ++ ){
                    System.out.println("Second thred: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(StudyThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        thread.start();
    }
    public static void main001(){
        UserInput threadUserInput = new UserInput();
        threadUserInput.start();
        try {
            threadUserInput.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(StudyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the running
     */
    public static boolean isRunning() {
        return running;
    }

    /**
     * @param aRunning the running to set
     */
    public static void setRunning(boolean aRunning) {
        running = aRunning;
    }
}
