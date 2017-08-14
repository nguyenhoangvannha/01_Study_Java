/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author NGUYENHOANGVANNHA
 */


public class ButtonDemo2 extends JFrame implements ActionListener{
    JButton button = new JButton("Click Button");
    JButton button2 = new JButton("Button 2");
    JLabel label = new JLabel("Orginal First");
    public ButtonDemo2(){
        this.setSize(300,400);
        this.setLocation(700,59);
        this.setTitle("Button Demo 2");
        
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button2.addActionListener(this);
        button.addActionListener(this);
        this.add(button,"South", 1);
        this.add(button2,"North", 1);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setForeground(Color.red);
//                label.setText("Clicked button");
//            }
//        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton temp = (JButton) e.getSource();
        if(temp == button){
            label.setText("Clicked button 1");
        } else if(temp == button2){
            label.setText("Clicked button 2");
        }
    }
    public static void main(String[] args) {
        ButtonDemo buttonFrame = new ButtonDemo();
        buttonFrame.setVisible(true);
    }

    
}
