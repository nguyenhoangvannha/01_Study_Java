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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MassageDialog extends JFrame implements ActionListener {
    private JButton button = new JButton("Button 1");
    private JLabel label = new JLabel("Label 1");
    public MassageDialog(){
        this.setSize(300,400);
        this.setLocation(600,50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Massage Dialog Demo");
        this.add(label);
        this.add(button,"South",1);
        button.addActionListener(this);
    }
    public static void main(String[] args) {
        MassageDialog massage = new MassageDialog();
        massage.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton butTemp = (JButton) e.getSource();
        if(butTemp == button){
            JOptionPane.showMessageDialog(null, "This is a massage dialog", "Thong bao", JOptionPane.WARNING_MESSAGE );
        }
    }
}
