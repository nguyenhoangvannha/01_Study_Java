/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.nhvn.components;

import javax.swing.JFrame;
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPopupMenu popup = new JPopupMenu("Option");
        JMenuItem itCopy = new JMenuItem("Copy");
        JMenuItem itCut = new JMenuItem("Cut");
        JMenuItem itPaste = new JMenuItem("Paste");
        popup.add(itCopy);
        popup.add(itCut);
        popup.add(itPaste);
        
        JTextArea area = new JTextArea();
        area.setComponentPopupMenu(popup);
        frame.add(area);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
