/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.nhvn.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MenuDemo implements ActionListener {
    private JMenuItem fNew;
    private JMenuItem fOpen;
    private JMenuItem fSave;
    private JMenuItem fExit;
    public MenuDemo(){
        JFrame frame = new JFrame("Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Tạo thanh menu
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        //Tạo menu file
        JMenu file = new JMenu("File");
        menubar.add(file);
        file.setMnemonic(KeyEvent.VK_F);
        
        fNew = new JMenuItem("New");
        file.add(fNew);
        fNew.addActionListener(this);
        
        fOpen = new JMenuItem("Open");
        file.add(fOpen);
        fOpen.addActionListener(this);
        
        fSave = new JMenuItem("Save");
        file.add(fSave);
        fSave.addActionListener(this);
        
        fSave.setMnemonic(KeyEvent.VK_S);
        //Thêm đường kẻ phân cách
        file.addSeparator();
     
        fExit = new JMenuItem("Exit");
        file.add(fExit);
        fExit.setMnemonic(KeyEvent.VK_X);
        fExit.addActionListener(this);
        
        JMenu edit = new JMenu("Edit");
        menubar.add(edit);
        edit.setMnemonic(KeyEvent.VK_E);
        
        JMenu eFind = new JMenu("Find");
        edit.add(eFind);
        
        JMenuItem efFind = new JMenuItem("Find");
        eFind.add(efFind);
        eFind.addActionListener(this);
        
        JMenuItem efFindReplace = new JMenuItem("Find and replace");
        eFind.add(efFindReplace);
        efFindReplace.addActionListener(this);
        
        frame.setSize(400, 300);
        frame.setLocation(300, 200);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        MenuDemo menu = new MenuDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem) e.getSource();
        if(item == fNew){
            JOptionPane.showMessageDialog(null,"New is clicked");
        }
        if(item == fOpen){
            JOptionPane.showMessageDialog(null,"Open is clicked");
        }
        if(item == fSave){
            JOptionPane.showMessageDialog(null,"Save is clicked");
        }
        if(item == fExit){
            System.exit(0);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
