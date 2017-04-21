package study.nhvn.components;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIconDemo extends JFrame {
	public ImageIconDemo(){
		this.setSize(500, 500);
		this.setLocation(500, 300);
		this.setForeground(Color.darkGray);
		this.setVisible(true);
		
		JLabel label = new JLabel();
		add(label);
		label.setSize(500,500);
		
		setPicture(label, "nha.PNG");
	}
	public void setPicture(JLabel label,String name){
		try {
			BufferedImage image = ImageIO.read(new File(name));
			int x =  label.getSize().width;
			int y = label.getSize().height;
			int ix = image.getWidth();
			int iy = image.getHeight();
			
			int dx = 0;
			int dy = 0;
			
			if((x/y) > (ix/iy)){
				dy = y;
				dx = dy * ix/iy;
			}
			else {
				dx = x;
				dy = dx *iy/ix;
			}
			
			ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, Image.SCALE_SMOOTH));
			label.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String args[]){
		ImageIconDemo imageDemo = new ImageIconDemo();
		
	}
}
