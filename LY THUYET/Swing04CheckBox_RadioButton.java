/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Swing04CheckBox_RadioButton extends JFrame {
    public Swing04CheckBox_RadioButton(String title){
        super(title);
        initComponents();
        addEvents();
    }

    private void initComponents() {
        //Get system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Swing04CheckBox_RadioButton.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //set Frame
        this.setSize(400,650);
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
        
        //Create CHECKBOX PANE and RADIO BUTTON PANE
        JPanel pnCheckBox_Radio = new JPanel();
        //pnCheckBox_Radio.setLayout(new BoxLayout(pnCheckBox_Radio, BoxLayout.X_AXIS));
        pnCheckBox_Radio.setLayout(new GridLayout(1, 2));
        pnMain.add(pnCheckBox_Radio);
        
        JPanel pnSoThich = new JPanel(); // create panel so thich
        pnSoThich.setLayout(new BoxLayout(pnSoThich, BoxLayout.Y_AXIS));
        pnSoThich.setPreferredSize(new Dimension(180, 10));
        cbxDiBoi = new JCheckBox("Di boi");
        cbxDiXemPhim = new JCheckBox("Di xem phim");
        pnSoThich.add(cbxDiBoi);
        pnSoThich.add(cbxDiXemPhim);
        pnCheckBox_Radio.add(pnSoThich);
        
        Border borderSoThich = BorderFactory.createLineBorder(Color.yellow);
        TitledBorder titleBorderSoThich = BorderFactory.createTitledBorder(borderSoThich, "So thich");
        pnSoThich.setBorder(titleBorderSoThich);
        
        JPanel pnGioiTinh = new JPanel(); //create panel gioi tinh
        pnGioiTinh.setLayout(new BoxLayout(pnGioiTinh, BoxLayout.Y_AXIS));
        pnGioiTinh.setPreferredSize(new Dimension(180, 100));
        rdNam = new JRadioButton("Nam");
        rdNam.setSelected(true);
        rdNu = new JRadioButton("Nu");
        ButtonGroup groupGioiTinh = new ButtonGroup();
        groupGioiTinh.add(rdNam);
        groupGioiTinh.add(rdNu);
        pnGioiTinh.add(rdNam);
        pnGioiTinh.add(rdNu);
        pnCheckBox_Radio.add(pnGioiTinh);
        
        Border borderGioiTinh = BorderFactory.createLineBorder(Color.yellow);
        TitledBorder titleBorderGioiTinh = BorderFactory.createTitledBorder(borderGioiTinh, "Gioi tinh");
        pnGioiTinh.setBorder(titleBorderGioiTinh);
        
        //create sub pane Ok
        JPanel pnOK = new JPanel();
        pnMain.add(pnOK);
        pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        btnOK = new Button("OK");
        pnOK.add(btnOK);
    }
    
    private void addEvents(){
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnOKActionPerFormed();
            }
        } );
    }
    private void btnOKActionPerFormed() {
        String ten = txtTen.getText();
        String diaChi = txtDiaChi.getText();
        StringBuilder strResult = new StringBuilder();
        strResult.append("Ten: " + ten + "\nDia chi: " + diaChi + "\nSo thich: ");
        
        if(cbxDiBoi.isSelected()) strResult.append(" " + cbxDiBoi.getText());
        if(cbxDiXemPhim.isSelected()) strResult.append(" " + cbxDiXemPhim.getText());
        
        strResult.append("\nGioi tinh: ");
        if(rdNam.isSelected()) strResult.append(" " + rdNam.getText());
        else strResult.append(" " + rdNu.getText());
        
        JOptionPane.showMessageDialog(null, strResult.toString(), "Ket qua", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    //variables declaration - do not modifie
    protected JTextField txtTen;
    protected JTextArea txtDiaChi;
    protected Button btnOK;
    protected JCheckBox cbxDiBoi;
    protected JCheckBox cbxDiXemPhim;
    protected JRadioButton rdNam;
    protected JRadioButton rdNu;
}
