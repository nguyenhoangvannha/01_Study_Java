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
import javax.swing.JTextField;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class TextFieldDemo extends JFrame implements ActionListener {
    private JTextField tfName;
    private JButton btChose = new JButton("Chose");
    public TextFieldDemo(){
        this.setSize(300,400);
        this.setLocation(600,50);
        this.setResizable(true);
        this.setTitle("Text Field Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(btChose,"South");
        tfName = new JTextField();
        this.add(tfName,"North");
        btChose.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((JButton)e.getSource() == btChose){
            JOptionPane.showMessageDialog(null, tfName.getText(), "Get Text", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    public static void main(String[] args) {
        TextFieldDemo tfDemo = new TextFieldDemo();
        tfDemo.setVisible(true);
    }
}
