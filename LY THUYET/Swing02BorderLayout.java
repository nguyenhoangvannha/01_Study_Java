/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Swing02BorderLayout extends JFrame {
    public Swing02BorderLayout(String title){
        super(title);
        initComponents();
    }
    private void initComponents(){
        
        //get system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Swing02BorderLayout.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //set Frame
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        
        //get container
        Container ctn = getContentPane();
        
        //Create panel
        JPanel pn = new JPanel();
        pn.setLayout(new BorderLayout()); //set border layout for pn
        
        JPanel pn1 = new JPanel();
        pn1.setBackground(Color.red);
        pn1.setPreferredSize(new Dimension(0, 100)); //set size for panel
        pn.add(pn1, BorderLayout.NORTH); //add pn1 into pn
        
        JPanel pn2 = new JPanel();
        pn1.setBackground(Color.BLUE);
        pn2.setPreferredSize(new Dimension(0, 100)); //set size for panel
        pn.add(pn2, BorderLayout.SOUTH); //add pn2 into pn
        
        JPanel pn3 = new JPanel();
        pn1.setBackground(Color.DARK_GRAY);
        pn3.setPreferredSize(new Dimension(50, 0)); //set size for panel
        pn.add(pn3, BorderLayout.WEST); //add pn3 into pn
        
        JPanel pn4 = new JPanel();
        pn1.setBackground(Color.ORANGE);
        pn4.setPreferredSize(new Dimension(50, 0)); //set size for panel
        pn.add(pn4, BorderLayout.EAST); //add pn4 into pn
        
        JPanel pn5 = new JPanel();
        pn1.setBackground(Color.MAGENTA);
        pn.add(pn5, BorderLayout.CENTER);
        
        //ADD PN TO ctn
        ctn.add(pn);
    }
}
