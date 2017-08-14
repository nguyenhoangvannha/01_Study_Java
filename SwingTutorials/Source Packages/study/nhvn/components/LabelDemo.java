package study.nhvn.components;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame {
	public LabelDemo(){
		setSize(400,350);
		this.setLocation(500, 300);
		setResizable(false);
		
		JLabel label = new JLabel("Nguyen Hoang Van Nha");
		this.add(label);
		label.setText("Nha");
		label.setToolTipText("Nha rat dep trai");
		label.setForeground(Color.CYAN);
	}
	public static void main(String args[]){
		LabelDemo labeldemo = new LabelDemo();
		labeldemo.setVisible(true);
	}
}

