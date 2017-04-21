package study.nhvn.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextfieldDemo extends JFrame implements ActionListener{
	private JTextField tfName;
	private JButton bHit;
	public TextfieldDemo(){
		setSize(400,400);
                setName("Textfield");
		setLocation(300,200);
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		tfName = new JTextField();
		add(tfName, "North", 0);
		bHit = new JButton("Enter");
		bHit.addActionListener(this);
		add(bHit,"South",0);
		
	}
	public static void main(String args[]){
		TextfieldDemo demo = new TextfieldDemo();
		demo.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((JButton)e.getSource() == bHit){
			JOptionPane.showMessageDialog(null, tfName.getText());
		}
	}
}
