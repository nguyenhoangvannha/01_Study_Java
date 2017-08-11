/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Swing03Exercise extends JFrame {
    public Swing03Exercise(String title){
        super(title);
        initComponents();
    }

    private void initComponents() {
        //Get system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Swing03Exercise.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //set Frame
        this.setSize(400,250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //get container
        Container container = getContentPane();
        
        //CREATE MAIN PANEL
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        container.add(pnMain);
        
        //create sub panel pnThongTin;
        JPanel pnThongTin = new JPanel();
        pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
        pnMain.add(pnThongTin);
        
        javax.swing.border.Border borderThongTin = BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow);
        TitledBorder titleBorderThongTin = new TitledBorder(borderThongTin, "Thong tin");
        pnThongTin.setBorder(titleBorderThongTin);
        
        
        JPanel pnTen = new JPanel(); //add pnTen
        pnTen.setLayout(new FlowLayout());
        pnThongTin.add(pnTen);
        
        JLabel lblTen = new JLabel("Nhap ten: ");
        pnTen.add(lblTen);
        
        txtTen = new JTextField(19);
        pnTen.add(txtTen);
        
        JPanel pnDiaChi = new JPanel(); //add pnDiaChi
        pnThongTin.add(pnDiaChi);
        
        JLabel lblDiaChi = new JLabel("Dia chi");
        pnDiaChi.add(lblDiaChi);
        
        txtDiaChi = new JTextArea(6,19);
        JScrollPane scrollPane = new JScrollPane(txtDiaChi, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnDiaChi.add(scrollPane);
        
        //create sub pane Ok
        JPanel pnOK = new JPanel();
        pnMain.add(pnOK);
        pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        btnOK = new Button("OK");
        pnOK.add(btnOK);
    }
    protected JTextField txtTen;
    protected JTextArea txtDiaChi;
    protected Button btnOK;
}
