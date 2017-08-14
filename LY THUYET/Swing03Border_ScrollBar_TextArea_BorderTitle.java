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
public class Swing03Border_ScrollBar_TextArea_BorderTitle extends JFrame {
    public Swing03Border_ScrollBar_TextArea_BorderTitle(String title){
        super(title);
        initComponents();
    }
    private JTextField txtTen;
    private JTextArea txtDiaChi;
    private Button btnOK;
    private void initComponents(){
        //set look and feel OS
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Swing03Border_ScrollBar_TextArea_BorderTitle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //set frame
        this.setSize(400, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        //this.setVisible(true);
        
        //set container
        Container ctn = getContentPane();
        
        //set panel
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        
        JPanel pnThongTin = new JPanel();
        pnMain.add(pnThongTin);
        pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
        
        JPanel pnTen = new JPanel();
        pnTen.setLayout(new BoxLayout(pnTen, BoxLayout.X_AXIS));
        JLabel lbTen = new JLabel("Nhap ten: ");
        txtTen = new JTextField(8);
        pnTen.add(lbTen);
        pnTen.add(txtTen);
        pnThongTin.add(pnTen);
        
        JPanel pnDiaChi = new JPanel();
        pnDiaChi.setLayout(new FlowLayout());
        JLabel lbDiaChi = new JLabel("Dia chi: ");
        txtDiaChi = new JTextArea(5, 19);
        txtDiaChi.setWrapStyleWord(true);
        txtDiaChi.setLineWrap(true);
                
        JScrollPane scp = new JScrollPane(txtDiaChi, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnDiaChi.add(lbDiaChi);
        pnDiaChi.add(scp);
        pnThongTin.add(pnDiaChi);
        
        javax.swing.border.Border borderThongTin = BorderFactory.createLineBorder(Color.yellow);
        TitledBorder borderTitleThongTin = new TitledBorder(borderThongTin, "Thong tin");
        pnThongTin.setBorder(borderTitleThongTin);
        borderTitleThongTin.setTitleJustification(TitledBorder.RIGHT);
        
        JPanel pnOK = new JPanel();
        pnMain.add(pnOK);
        pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnOK = new Button("OK");
        pnOK.add(btnOK);
        
        ctn.add(pnMain);
    }
}
