package study.nhvn.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonDemo extends JFrame implements ActionListener{
	private JLabel label;
	private JButton button1;
	
	public ButtonDemo(){
		setSize(500,400);
		setLocation(200, 200);
		setForeground(Color.magenta);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Hello world");
		add(label);
		
		JButton button = new JButton("Click me");
		add(button,"North",1);//West South East
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				changeText();
			}
		});
		
		button1 = new JButton("Enter me");
		add(button1,"South", 1);
		button1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource(); 
		if(b == button1){
			label.setText("Nguoi ngoai hanh tinh");
		}
	}
	public void changeText(){
		label.setText("Nguyen Hoang Van Nha");
	}
	public static void main(String args[]){
		ButtonDemo buttondemo = new ButtonDemo();
		buttondemo.setVisible(true);
	}
	
}
