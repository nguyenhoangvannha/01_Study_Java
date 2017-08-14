package jdb.java.swingadv;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class SwingAdv01JTable extends JFrame {
	public SwingAdv01JTable(String title) {
		super(title);
		initComponents();
		addEvents();
	}

	private DefaultTableModel dtm;
	private JTable tblSinhVien;
	private JButton btnThem;
	private JButton btnXoa;
	
	private void addEvents() {
		// TODO Auto-generated method stub
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnThemActionPerformed(arg0);
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnXoaActionPerformed(arg0);
			}
		});
		tblSinhVien.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tblSinhVienMouseClicked(arg0);
			}
		});
	}

	protected void tblSinhVienMouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int row = tblSinhVien.getSelectedRow();
		int colum = tblSinhVien.getColumnCount();
		StringBuilder strResult = new StringBuilder();
		for(int i = 0; i < colum; i++) {
			strResult.append(tblSinhVien.getValueAt(row, i));
		}
		JOptionPane.showMessageDialog(null, strResult.toString());
	}

	protected void btnXoaActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int row = tblSinhVien.getSelectedRow();
		if(row == -1) {
			
		} else {
			dtm.removeRow(row);
		}
	}

	protected void btnThemActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		vector.add("SV009");
		vector.add("Jeem So Bon");
		vector.add("21/12/1969");
		vector.add("Ha Noi");
		dtm.addRow(vector);
	}

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
		this.setSize(800,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//
		Container ctn = getContentPane();
		
		//
		JPanel pnLeft = new JPanel();
		pnLeft.setPreferredSize(new Dimension(500, 0));
		JPanel pnRight = new JPanel();
		JSplitPane spn = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
		ctn.add(spn);
		
		//Tao default table model
		dtm = new DefaultTableModel();
		dtm.addColumn("Ma SV");
		dtm.addColumn("Ho va ten");
		dtm.addColumn("Ngay sinh");
		dtm.addColumn("Dia chi");
		
		dtm.addRow(new String[] {"SV001", "Nguyen Hoang Quan", "20/2/1989", "TP.HCM"});
		dtm.addRow(new String[] {"SV002", "Doan Thi Duan", "15/3/1995", "Quang Ngai"});
		
		tblSinhVien = new JTable(dtm);
		JScrollPane scp = new JScrollPane(tblSinhVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnLeft.setLayout(new BorderLayout());
		pnLeft.add(scp, BorderLayout.CENTER);
		
		//
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnThem = new JButton("Them");
		btnXoa = new JButton("Xoa");
		pnButton.add(btnThem);
		pnButton.add(btnXoa);
		pnLeft.add(pnButton, BorderLayout.SOUTH);
	}
	
	
}
