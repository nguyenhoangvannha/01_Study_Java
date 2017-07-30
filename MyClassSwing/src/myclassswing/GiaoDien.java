/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclassswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class GiaoDien extends JFrame{

    /**
     * @param args the command line arguments
     */
    private JLabel lbName;
    public GiaoDien(String title) {
        // TODO code application logic here
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400, 70);
        this.setSize(400, 300);
        lbName = new JLabel();
        lbName.setText("Ho va ten");
        this.add(lbName);
        
    }
    
}
