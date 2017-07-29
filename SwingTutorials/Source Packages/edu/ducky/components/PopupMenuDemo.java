/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class PopupMenuDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocation(500, 60);
        
        JTextArea taInput = new JTextArea();
        frame.add(taInput);
        
        JPopupMenu popup = new JPopupMenu("Option");
        JMenuItem itemCopy = new JMenuItem("Copy");
        JMenuItem itemPaste = new JMenuItem("Paste");
        JMenuItem itemCut = new JMenuItem("Cut");
        popup.add(itemCopy);
        popup.addSeparator();
        popup.add(itemPaste);
        popup.add(itemCut);
        
        
        taInput.setComponentPopupMenu(popup);
        
        frame.setVisible(true);
    }
}
