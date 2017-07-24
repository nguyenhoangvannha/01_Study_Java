/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class HelloWorld extends JFrame {
    public HelloWorld(){
        this.setSize(300, 200);
        this.setLocation(700, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        JLabel hello = new JLabel("Hello world");
        hello.setToolTipText("Tool tip day ma");
        hello.setBackground(Color.red);
        hello.setForeground(Color.DARK_GRAY);
        this.setTitle("Xin chao the gioi");
        this.add(hello);
        
    }
    public static void main(String[] args) {
        HelloWorld world = new HelloWorld();
        world.setVisible(true);
    }
}
