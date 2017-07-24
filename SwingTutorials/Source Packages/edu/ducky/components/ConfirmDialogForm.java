/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class ConfirmDialogForm extends JFrame implements ActionListener {
    private JButton button1 = new JButton("Button 1");
    public ConfirmDialogForm(){
        this.setSize(300,200);
        this.setLocation(100,50);
        this.setResizable(false);
        this.setTitle("Confirm Dialog Demo");
        this.add(button1,"South");
        button1.addActionListener(this);
    }
    
    public static void main(String[] args) {
        ConfirmDialogForm conf = new ConfirmDialogForm();
        conf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton temp = (JButton) e.getSource();
        if(temp == button1){
            int click = JOptionPane.showConfirmDialog(null, "Confirm successful");
            if(click == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Da chon yes","Thong bao",JOptionPane.OK_OPTION);
            }
        } 
    }
}
