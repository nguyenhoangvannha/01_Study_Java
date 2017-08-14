/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MenuDemo extends JFrame implements ActionListener{
    private JMenuItem itemNew;
    private JMenuItem itemOpen = new JMenuItem("Open");
    private JMenuItem itemSave = new JMenuItem("Save");
    private JMenuItem itemExit;
    public MenuDemo(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setSize(500, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(500, 60);
        this.setTitle("Menu Demo");
        
        
        
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        //     ====================================   
        JMenu menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuBar.add(menuFile);
        
        itemNew = new JMenuItem("New");
        itemNew.addActionListener(this);
        itemNew.setMnemonic(KeyEvent.VK_N);
        menuFile.add(itemNew);
        
        
        itemOpen.addActionListener(this);
        itemOpen.setMnemonic(KeyEvent.VK_O);
        menuFile.add(itemOpen);
        
        
        itemSave.addActionListener(this);
        itemSave.setMnemonic(KeyEvent.VK_S);
        menuFile.add(itemSave);
//      Duong ke ngang
        menuFile.addSeparator();
        
        itemExit = new JMenuItem("Exit");
        itemExit.addActionListener(this);
        itemExit.setMnemonic(KeyEvent.VK_E);
        menuFile.add(itemExit);
//     ====================================
        
        JMenu menuEdit = new JMenu("Edit");
        menuFile.setMnemonic(KeyEvent.VK_E);
        menuBar.add(menuEdit);
//      Menu(item)chinh
        JMenu menuFind = new JMenu("Find");
        menuFind.setMnemonic(KeyEvent.VK_F);
        menuEdit.add(menuFind);
//      item cho menu find
        JMenuItem itemFind = new JMenuItem("Find Only");
        itemFind.addActionListener(this);
        menuFind.add(itemFind);
        
        JMenuItem itemReplace = new JMenuItem("Find and replace");
        itemReplace.addActionListener(this);
        menuFind.add(itemReplace);

    }
    public static void main(String[] args) {
        MenuDemo demo = new MenuDemo();
        
        
        
        demo.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem) e.getSource();
        if(item == itemOpen) {
            JOptionPane.showMessageDialog(null, "Clicked Open");
        }
        if(item == itemSave) {
            JOptionPane.showMessageDialog(null, "Clicked Save");
        }
        if(item == itemNew) {
            JOptionPane.showMessageDialog(null, "Clicked New");
        }
        if(item == itemExit) {
            System.exit(0);
        }
    }
}
