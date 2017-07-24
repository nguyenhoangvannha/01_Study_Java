/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap01.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class HelloWorld {
    public HelloWorld(){
        JFrame newFrame = new JFrame("HelloWorld");
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setVisible(true);
        newFrame.setSize(300, 400);
        newFrame.setLocation(800, 50);
        newFrame.setResizable(false);
        JLabel label = new JLabel("Hello NHVN");
        newFrame.add(label);
    }
    public static void main(String[] args) {
        HelloWorld newHello = new HelloWorld();
    }
}
 