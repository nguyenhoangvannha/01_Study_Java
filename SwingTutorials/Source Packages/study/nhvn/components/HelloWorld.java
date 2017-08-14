package study.nhvn.components; //component thanh phan

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame {
	public HelloWorld(){
		//this.setSize(400,200);
		setSize(400,300);//Kich thuoc cua so
		setVisible(true);// co the nhin thay
		setLocation(500, 300);// dat vi tri cua so
		setResizable(false); // khong cho phep thay doi kich thuoc cua so
		JLabel label = new JLabel("HelloWorld");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(label);
	}
	public static void main(String args[]){
		HelloWorld hello = new HelloWorld();
		//hello.setVisible(true);
	}
}
