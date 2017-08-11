/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic;

import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Swing02BoxLayout extends JFrame {
    public Swing02BoxLayout(String title){
        super(title);
        initComponents();
    }
    private void initComponents(){
        //GET look and feel to each OS
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Swing02BoxLayout.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Set Frame
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        
        //get container class
        Container ctn = getContentPane();
        
        //Create a panel
        JPanel pn = new JPanel();
        
        //Set boxlayout for pn
        //pn.setLayout(new BoxLayout(pn, BoxLayout.X_AXIS));
        pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));
        //Add controls to pn
        JButton bt1 = new JButton("Button 1");
        JButton bt2 = new JButton("Button 2");
        JButton bt3 = new JButton("Button 3");
        JButton bt4 = new JButton("Button 4");
        JButton bt5 = new JButton("Button 5");
        pn.add(bt1);
        pn.add(bt2);
        pn.add(bt3);
        pn.add(bt4);
        pn.add(bt5);
        
        //add pn to ctn
        ctn.add(pn);
    }
}
