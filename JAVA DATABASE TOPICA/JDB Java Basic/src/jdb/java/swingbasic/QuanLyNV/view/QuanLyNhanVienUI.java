package jdb.java.swingbasic.QuanLyNV.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;

import jdb.java.swingbasic.QuanLyNV.model.NhanVien;
import jdb.java.swingbasic.QuanLyNV.model.PhongBan;


public class QuanLyNhanVienUI extends JFrame {
	private ArrayList<NhanVien> dsNhanVien;
	private ArrayList<PhongBan> dsPhongBan;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public QuanLyNhanVienUI(String title) {
		super(title);
		initComponents();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		cbPhongBan.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				cbPhongBanItemStateChanged(e);
			}
		});
		lstNhanVien.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				lstNhanVienMouseClicked(e);
			}
		});
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	protected void lstNhanVienMouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		NhanVien nv = lstNhanVien.getSelectedValue();
		txtTen.setText(nv.getTenNV());
		txtMa.setText(nv.getMaNV());
		txtNgayVaoLam.setText(sdf.format(nv.getNgayVaoLamViec()));
		txtNamSinh.setText(sdf.format(nv.getNamSinh()));
	}

	protected void cbPhongBanItemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		PhongBan pb = (PhongBan)e.getItem();
		lstNhanVien.removeAll();
		lstNhanVien.setListData(pb.getDsNhanVien());
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		//Get OS UI
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Set Frame
		this.setSize(500,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Get container
		Container container = getContentPane();
		
		//Main panel
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		container.add(pnMain);
		
		//Line one
		JPanel pnPhongBan = new JPanel();
		pnPhongBan.setLayout(new FlowLayout());
		pnMain.add(pnPhongBan);
		JLabel lblPhongBan = new JLabel("Chon phong ban: ");
		cbPhongBan = new JComboBox<PhongBan>();
		cbPhongBan.setPreferredSize(new Dimension(200, 25));
		pnPhongBan.add(lblPhongBan);
		pnPhongBan.add(cbPhongBan);
		
		//Line two
		JPanel pnDanhSachVaChiTiet = new JPanel();
		pnDanhSachVaChiTiet.setLayout(new GridLayout(1, 2));
		pnMain.add(pnDanhSachVaChiTiet);
		
		JPanel pnDanhSach = new JPanel();
		pnDanhSach.setLayout(new BorderLayout());
		pnDanhSachVaChiTiet.add(pnDanhSach);
		lstNhanVien = new JList<NhanVien>();
		lstNhanVien.setForeground(Color.MAGENTA);
		JScrollPane sbDanhSach = new JScrollPane(lstNhanVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDanhSach.add(sbDanhSach, BorderLayout.CENTER);
		javax.swing.border.Border borderDanhSach = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder titleBorderDanhSach = BorderFactory.createTitledBorder(borderDanhSach, "Danh sach nhan vien");
		pnDanhSach.setBorder(titleBorderDanhSach);
		
		JPanel pnChiTiet = new JPanel();
		pnChiTiet.setLayout(new GridLayout(4, 2));
		javax.swing.border.Border borderChiTiet = BorderFactory.createLineBorder(Color.PINK);
		TitledBorder titleBorderChiTiet = BorderFactory.createTitledBorder(borderChiTiet, "Thong tin chi tiet");
		pnChiTiet.setBorder(titleBorderChiTiet);
		
		pnDanhSachVaChiTiet.add(pnChiTiet);
		JLabel lblMa = new JLabel("Ma NV");
		JLabel lblTen = new JLabel("Ten NV");
		JLabel lblNgayLam = new JLabel("Ngay lam");
		JLabel lblNamSinh = new JLabel("Nam sinh");
		txtMa = new JTextField(20);
		txtTen = new JTextField(20);
		txtNgayVaoLam = new JTextField(20);
		txtNamSinh = new JTextField(20);
		pnChiTiet.add(lblMa);
		pnChiTiet.add(txtMa);
		pnChiTiet.add(lblTen);
		pnChiTiet.add(txtTen);
		pnChiTiet.add(lblNgayLam);
		pnChiTiet.add(txtNgayVaoLam);
		pnChiTiet.add(lblNamSinh);
		pnChiTiet.add(txtNamSinh);
		
		//Line Three
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnMain.add(pnButton);
		btnLuu = new JButton("Luu");
		btnXoa = new JButton("Xoa");
		btnThoat = new JButton("Thoat");
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnButton.add(btnThoat);
	}
	
	public void autoCreateData() {
		dsPhongBan = new ArrayList<PhongBan>();
		PhongBan pCTSV = new PhongBan();
		pCTSV.setMaPhong("P001");
		pCTSV.setTenPhong("Phong Cong Tac Sinh Vien");
		PhongBan pDT = new PhongBan();
		pDT.setMaPhong("P002");
		pDT.setTenPhong("Phong dao tao");
		PhongBan pKTDBCL = new PhongBan();
		pKTDBCL.setMaPhong("P003");
		pKTDBCL.setTenPhong("Phong KT DBCL");
		dsPhongBan.add(pCTSV);
		dsPhongBan.add(pDT);
		dsPhongBan.add(pKTDBCL);
		for(PhongBan pb: dsPhongBan) {
			cbPhongBan.addItem(pb);
		}
		
		pCTSV.themNhanVien(new NhanVien("CTSV001", "Nguyen Van Luu", new Date(2017 - 1990, 9,18), new Date(1993 - 1990, 2, 3)));
		pCTSV.themNhanVien(new NhanVien("CTSV002", "Doan Van Dang", new Date(2017 - 1990, 2,28), new Date(1992 - 1990, 1, 24)));
		pCTSV.themNhanVien(new NhanVien("CTSV003", "Tran Thi Hoa", new Date(2015 - 1990, 9,8), new Date(1991 - 1990, 7, 26)));
		pCTSV.themNhanVien(new NhanVien("CTSV004", "Le Xuan Thieu", new Date(2013 - 1990, 4,21), new Date(1994 - 1990, 8, 3)));
		pDT.themNhanVien(new NhanVien("DT001", "Truong Dao", new Date(2014 - 1990, 9, 29), new Date(1995 - 1990, 5, 8)));
		pDT.themNhanVien(new NhanVien("DT002", "Luu Trong", new Date(2016 - 1990, 1, 9), new Date(1992 - 1990, 1, 2)));
	}
	//Valiable declaretion
	private JComboBox<PhongBan> cbPhongBan;
	private JList<NhanVien> lstNhanVien;
	private JTextField txtMa, txtTen, txtNgayVaoLam, txtNamSinh;
	private JButton btnLuu, btnXoa, btnThoat;	
}
