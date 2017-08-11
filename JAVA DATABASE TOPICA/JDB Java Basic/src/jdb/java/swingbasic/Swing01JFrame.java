/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Swing01JFrame extends JFrame{
    public Swing01JFrame(){
        initComponents();
        addControls();
    }
    public void initComponents(){
        //Generate Frame
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tieu de cua so");
        this.setResizable(false);
        this.setVisible(true);
    }
    public void addControls(){
        //Lay lop chua cua so ra
        Container container = getContentPane();
        JPanel pnOne = new JPanel();
        pnOne.setBackground(Color.red);
        container.add(pnOne);
    }
    public static void main(String[] args) {
        Swing01JFrame mainFrame = new Swing01JFrame();
    }
}
