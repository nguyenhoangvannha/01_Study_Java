package quanlycongvan.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import quanlycongvan.controler.CongVanService;
import quanlycongvan.model.CongVan;

public class QuanLyCongVanUI extends JFrame {
	
	private DefaultTableModel dtmCongVan;
	private JTable tblCongVan;
	public QuanLyCongVanUI(String title) {
		super(title);
		initComponents();
		loadBangCongVan();
		addEvents();
	}

	private void loadBangCongVan() {
		// TODO Auto-generated method stub
		CongVanService cvs = new CongVanService();
		ArrayList<CongVan> arrCV = new ArrayList<CongVan>();
		arrCV = cvs.getByUser(1);
		for(CongVan cv: arrCV) {
			Vector temp = new Vector();
			temp.add(cv.getID());
			temp.add(cv.getCoQuanID());
			temp.add(cv.getNgayVanBan());
			dtmCongVan.addRow(temp);
		}
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setSize(800, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container ctn = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		ctn.add(pnMain);
		
		JPanel pnLeft = new JPanel();
		pnLeft.setBackground(Color.lightGray);
		pnLeft.setLayout(new BorderLayout());
		pnLeft.setPreferredSize(new Dimension(300, 0));
		JPanel pnRight = new JPanel();
		pnRight.setBackground(Color.cyan);
		
		JSplitPane splMain = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
		pnMain.add(splMain, BorderLayout.CENTER);
		
		dtmCongVan = new DefaultTableModel();
		dtmCongVan.addColumn("Ma");
		dtmCongVan.addColumn("Co Quan");
		dtmCongVan.addColumn("Ngay Van Ban");
		tblCongVan = new JTable(dtmCongVan);
		JScrollPane scpCongVan = new JScrollPane(tblCongVan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
				,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnLeft.add(scpCongVan, BorderLayout.CENTER);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		
	}
	
}
