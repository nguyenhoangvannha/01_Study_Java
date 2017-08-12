package jdb.java.swingadv;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class KhachHangUI extends JFrame{
	public KhachHangUI(String title) {
		super(title);
		initComponents();
		autoData();
		addEvents();
	}
	
	DefaultMutableTreeNode root;
	JTree tree;
	
	DefaultTableModel tbModel;
	JTable table;
	
	JTextField txtMa, txtTen, txtSDT,txtEmail;
	
	JButton btnLuu, btnXoa;
	
	ArrayList<NhomKhachHang> dsNhom;
	ArrayList<KhachHang> dsKH;
	
	NhomKhachHang nhomSelected;
	KhachHang khachSelected;
	
	private void initComponents() {
		// TODO Auto-generated method stub
		//
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//
		Container ctn = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		ctn.add(pnMain);
		
		JPanel pnLeft = new JPanel();
		pnLeft.setPreferredSize(new Dimension(300, 0));
		pnLeft.setLayout(new BorderLayout());
		root = new DefaultMutableTreeNode("Nhom khach hang");
		tree = new JTree(root);
		JScrollPane scpTree = new JScrollPane(tree, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		pnLeft.add(scpTree, BorderLayout.CENTER);
		
		
		JPanel pnRightNorth = new JPanel();
		pnRightNorth.setPreferredSize(new Dimension(0, 380));
		pnRightNorth.setLayout(new BorderLayout());
		tbModel = new DefaultTableModel();
		tbModel.addColumn("Mã Khách Hàng");
		tbModel.addColumn("Tên Khách Hàng");
		tbModel.addColumn("Số Điện Thoại");
		tbModel.addColumn("Thư Điện Tử");

		table = new JTable(tbModel);
		JScrollPane scpTable = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		pnRightNorth.add(scpTable, BorderLayout.CENTER);
		
		JPanel pnRightSouth = new JPanel();
		pnRightSouth.setLayout(new BoxLayout(pnRightSouth, BoxLayout.Y_AXIS));
		
		JLabel lblMa = new JLabel("Mã Khách Hàng");
		txtMa = new JTextField(20);
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		pnRightSouth.add(pnMa);
		
		
		JLabel lblTen = new JLabel("Tên Khách Hàng");
		txtTen = new JTextField(20);
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnRightSouth.add(pnTen);
		
		JLabel lblSDT = new JLabel("Số điện thoại");
		txtSDT = new JTextField(20);
		JPanel pnSDT = new JPanel();
		pnSDT.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnSDT.add(lblSDT);
		pnSDT.add(txtSDT);
		pnRightSouth.add(pnSDT);
		
		JLabel lblEmail = new JLabel("Thư điện tử");
		txtEmail = new JTextField(20);
		JPanel pnEmail = new JPanel();
		pnEmail.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		pnEmail.add(lblEmail);
		pnEmail.add(txtEmail);
		pnRightSouth.add(pnEmail);
		
		lblMa.setPreferredSize(lblTen.getPreferredSize());
		lblSDT.setPreferredSize(lblTen.getPreferredSize());
		lblEmail.setPreferredSize(lblTen.getPreferredSize());
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		btnLuu = new JButton("Lưu Khách Hàng");
		btnXoa = new JButton("Xóa Khách Hàng");
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnRightSouth.add(pnButton);
		
		JSplitPane pnRight = new JSplitPane(JSplitPane.VERTICAL_SPLIT,pnRightNorth, pnRightSouth);
		
		JSplitPane spl = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
		pnMain.add(spl, BorderLayout.CENTER);
		
	}

	public void autoData() {
		dsNhom = new ArrayList<NhomKhachHang>();
		NhomKhachHang vip = new NhomKhachHang("N001", "Khách Hàng VIP");
		NhomKhachHang tiemNang = new NhomKhachHang("NOO2", "Khách Hàng Tiềm Năng");
		dsNhom.add(vip);
		dsNhom.add(tiemNang);
		
		vip.getDsKH().add( new KhachHang("KH001", "Mong Thi Mo", "01689168594", "mongmo@hotmail.com"));
		vip.getDsKH().add( new KhachHang("KH005", "Hoang Thi Hong", "0987463736", "hongthi@gmail.com"));
		vip.getDsKH().add( new KhachHang("KH006", "Truong Minh Tue", "0123758474", "tueminh@hotmail.com"));
		vip.getDsKH().add( new KhachHang("KH004", "Mong Van Mo", "0804758383", "movan@gmail.com"));
		
		
		tiemNang.getDsKH().add( new KhachHang("KH002", "Nguyen Truong To", "0980574643", "totruong@gmail.com"));
		tiemNang.getDsKH().add( new KhachHang("KH003", "Chu Van Vuong", "0129775735", "vuongchu@gmail.com"));
		tiemNang.getDsKH().add( new KhachHang("KH007", "Vo Thi Tam", "01695863544", "tamvo@gmail.com"));
		tiemNang.getDsKH().add( new KhachHang("KH008", "E Le Van", "01624747334", "vane@hotmail.com"));
		
		for (NhomKhachHang nhom: dsNhom) {
			DefaultMutableTreeNode nodeNhom = new DefaultMutableTreeNode(nhom);
			root.add(nodeNhom);
			for(KhachHang kh: nhom.getDsKH()) {
				DefaultMutableTreeNode nodeKH = new DefaultMutableTreeNode(kh);
				nodeNhom.add(nodeKH);
			}
		}
		
		
	}
	
	private void addEvents() {
		// TODO Auto-generated method stub
		tree.addMouseListener(new MouseListener() {
			
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
				DefaultMutableTreeNode nodeS = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				
				if(nodeS.getLevel() == 1) {
					nhomSelected = (NhomKhachHang) nodeS.getUserObject();
					hienThiNhomKhachHang();
				}
				
			}
		});
		table.addMouseListener(new MouseListener() {
			
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
				int rowSelected = table.getSelectedRow();
				if(rowSelected == -1) return;
				
				txtMa.setText((String) table.getValueAt(rowSelected, 0));
				txtTen.setText((String) table.getValueAt(rowSelected, 1));
				txtSDT.setText((String) table.getValueAt(rowSelected, 2));
				txtEmail.setText((String) table.getValueAt(rowSelected, 3));
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultMutableTreeNode nodeS = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				if(nodeS.getLevel() == 2) {
					khachSelected = (KhachHang) nodeS.getUserObject();
					
				}
			}
		});
		btnLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultMutableTreeNode nodeS = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
//				
//				if(nodeS.getLevel() == 1) {
//					nhomSelected = (NhomKhachHang) nodeS.getUserObject();
//				}
				themKhachHang();
				DefaultMutableTreeNode subNode = new DefaultMutableTreeNode((KhachHang)nhomSelected.getDsKH().lastElement());
				nodeS.add(subNode);

			}
		});
	}

	protected void themKhachHang() {
		// TODO Auto-generated method stub
		nhomSelected.getDsKH().add(new KhachHang(txtMa.getText(), txtTen.getText(), txtSDT.getText(), txtEmail.getText()));
	}

	protected void hienThiNhomKhachHang() {
		// TODO Auto-generated method stub
		tbModel.setRowCount(0);
		for(KhachHang kh: nhomSelected.getDsKH()) {
			Vector<String> vector = new Vector();
			vector.add(kh.getMa());
			vector.add(kh.getTen());
			vector.add(kh.getSoDienThoai());
			vector.add(kh.getEmail());
			tbModel.addRow(vector);
		}
	}
	
}
