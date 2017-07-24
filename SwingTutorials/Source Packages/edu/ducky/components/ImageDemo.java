/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class ImageDemo extends JFrame {
    public ImageDemo(){
        this.setSize(300,200);
            this.setLocation(700, 50);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Image Demo");
        try {
            JLabel newLabel = new JLabel();
            BufferedImage bfImage = ImageIO.read(new File("nha.PNG"));
            int x = newLabel.getWidth();
            int  y = newLabel.getHeight();
            int ix = bfImage.getWidth();
            int iy = bfImage.getHeight();
//            int dx = 0;
//            int dy = 0;
//            if((x/y) > (ix/iy)){
//                dx = x;
//                dy = dx * ix/iy;
//            }
            ImageIcon ico = new ImageIcon(bfImage.getScaledInstance(200, 200, bfImage.SCALE_SMOOTH));
            newLabel.setIcon(ico); 
            this.add(newLabel);
        } catch (IOException ex) {
            Logger.getLogger(ImageDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        ImageDemo imageDemo = new ImageDemo();
        imageDemo.setVisible(true);
    }
}
