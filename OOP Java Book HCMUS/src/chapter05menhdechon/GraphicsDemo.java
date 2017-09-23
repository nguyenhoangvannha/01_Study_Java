/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05menhdechon;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class GraphicsDemo {
    public static void main(String[] args) {
        JFrame win;
        Container ctn;
        Graphics g;
        win = new JFrame("My first rectangle");
        win.setSize(300,200);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        win.setVisible(true);
        ctn = win.getContentPane();
        g = ctn.getGraphics();
         g.setColor(Color.GREEN);
        g.drawRect(50, 50, 100, 30);
    }
}
