package study.nhvn.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MassageDialogDemo extends JFrame {
	public MassageDialogDemo(){
		setSize(500,400);
		setLocation(500,200);
		setForeground(Color.DARK_GRAY);
		setResizable(false);
		//setVisible(true);
		
		JLabel label = new JLabel("Massage Dialog Demo");
		add(label);
		
		JButton button = new JButton("Click here");
		add(button,"North",1);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = "Nguyen Nha";
//				JOptionPane.showMessageDialog(null, "This is a massage dialog");
				JOptionPane.showMessageDialog(null, "Pharse: " + name,"Title", JOptionPane.QUESTION_MESSAGE);
			}
		});
		
		
	}
	public static void main(String args[]){
		MassageDialogDemo demo = new MassageDialogDemo();
		demo.setVisible(true);
		
	}
}
