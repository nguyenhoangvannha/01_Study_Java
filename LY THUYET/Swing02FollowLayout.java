/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Swing02FollowLayout extends JFrame{
    public Swing02FollowLayout(String title){
        super(title);
        initComponents();
        addControls();
    }
    public void initComponents(){
        //Generate Frame
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setVisible(true);
    }
    public void addControls(){
        //Lay lop chua cua so ra
        Container container = getContentPane();
        JPanel pnOne = new JPanel();
        //FOLLOW LAYOUT
        pnOne.setLayout(new FlowLayout());
        pnOne.setBackground(Color.red);
        
        JButton bt1 = new JButton("Button 01");
        JButton bt2 = new JButton("Button 02");
        JButton bt3 = new JButton("Button 03");
        JButton bt4 = new JButton("Button 04");
        JButton bt5 = new JButton("Button 05");
        pnOne.add(bt1);
        pnOne.add(bt2);
        pnOne.add(bt3);
        pnOne.add(bt4);
        pnOne.add(bt5);
        container.add(pnOne);
    }
}
