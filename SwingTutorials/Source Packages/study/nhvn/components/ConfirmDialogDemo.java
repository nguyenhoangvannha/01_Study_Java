package study.nhvn.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ConfirmDialogDemo extends JFrame{
	public ConfirmDialogDemo(){
		this.setSize(500, 300);
		this.setLocation(500, 300);
		this.setResizable(false);
		this.setForeground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Confirm message dialog.");
		add(label);
		
		JButton button = new JButton("Click me");
		add(button,"South", 1);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				JOptionPane.showConfirmDialog(null, "This is a confirm dialog"); //cach 1
				//CACH 2
//				
//				int click = JOptionPane.showConfirmDialog(null, "Nguyen Hoang Van NHa rat dep trai");
//				if(click == JOptionPane.YES_OPTION){
//					JOptionPane.showMessageDialog(null, "Duong nhien roi.");
//				}
//				if(click == JOptionPane.NO_OPTION) {
//					JOptionPane.showMessageDialog(null, "Co chu sao khong.");
//				}
//				if(click == JOptionPane.CANCEL_OPTION) {
//					JOptionPane.showMessageDialog(null, "Da Thoat.");
//				}
//				if(click == JOptionPane.CLOSED_OPTION) {
//					JOptionPane.showMessageDialog(null, "Ban Dong cua so.");
//				}
				
				//Cach 3
				int click = JOptionPane.showConfirmDialog(null, "Is the world end", "The wordl", JOptionPane.YES_NO_OPTION);
			}
		});
		
	}
	public static void main(String args[]){
		ConfirmDialogDemo demo = new ConfirmDialogDemo();
		demo.setVisible(true);
	}
}
