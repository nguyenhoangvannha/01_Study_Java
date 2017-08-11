/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Swing05JComboBox_JList extends JFrame{
    public Swing05JComboBox_JList(String title){
        super(title);
        initComponents();
        addEvents();
    }

    private void initComponents() {
        //Get OS UI
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex){
        }
        
        //Set frame
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Get container 
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,1));
        //
        JPanel pnCombo = new JPanel();
        pnCombo.setLayout(new FlowLayout());
        JLabel lblChonSo = new JLabel("Chon mot so");
        DefaultComboBoxModel modelSo = new DefaultComboBoxModel();
        for(int i = 0; i < 10; i++){
            modelSo.addElement(i);
        }
        cboSo = new JComboBox();
        cboSo.setModel(modelSo);
        pnCombo.add(cboSo);
        container.add(pnCombo);
        
        
        JPanel pnList = new JPanel();
        pnList.setLayout(new FlowLayout());
        JLabel lblChonSo2  = new JLabel("Chon so thu 2:");
        pnList.add(lblChonSo2);
        lstSo = new JList();
        Vector<Integer> vector = new Vector<Integer>();
        
        Random rd = new Random();
        for(int i = 0; i < 30; i++){
            int x = rd.nextInt();
            vector.add(x);
        }
        lstSo.setListData(vector);
        JScrollPane scrollSo = new JScrollPane(lstSo,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnList.add(lstSo);
        pnList.add(scrollSo);
        container.add(pnList);
    }

    private void addEvents() {
        cboSo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int chon = cboSo.getSelectedIndex();
                JOptionPane.showMessageDialog(null, "So da chon: " + chon);
            }
        });
    }
    
    private JComboBox cboSo;
    private JList lstSo;
}
