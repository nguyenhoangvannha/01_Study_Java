/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclassswing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MyGridBagLayout extends JFrame {
    private JPanel pMain, pEast, pWest, pNorth, pSouth;
    private JLabel lbEast, lbWest, lbNorth, lbSourth;
    public MyGridBagLayout(String title){
        super(title);
        this.setLocation(400, 70);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pMain = new JPanel();
        pMain.setLayout(new BorderLayout());
        
        pEast = new JPanel();
        pEast.setBackground(Color.red);
        pWest = new JPanel();
        pWest.setBackground(Color.BLUE);
        pNorth = new JPanel();
        pNorth.setBackground(Color.CYAN);
        pSouth = new JPanel();
        pSouth.setBackground(Color.ORANGE);
        
        
    }
}
