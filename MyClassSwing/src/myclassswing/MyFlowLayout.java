/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclassswing;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MyFlowLayout extends JFrame {
    private JLabel jLabel1,jLabel2, jLabel3;
    public MyFlowLayout(String title){
        super(title);
        jLabel1 = new JLabel("Ho ten");
        jLabel2 = new JLabel("Dia chi");
        jLabel3 = new JLabel("Gioi tinh");
        this.setLayout(new FlowLayout());
        this.add(jLabel1);
        this.add(jLabel2);
        this.add(jLabel3);
    }
}
