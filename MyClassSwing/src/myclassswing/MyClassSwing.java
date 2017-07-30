/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclassswing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MyClassSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                MyBorderLayout borderLayout = new MyBorderLayout("Border demo");
                borderLayout.setVisible(true);
//                MyFlowLayout flowLayout = new MyFlowLayout("Flow layout...");
//                flowLayout.setSize(400,300);
//                flowLayout.setLocation(400, 50);
//                flowLayout.setVisible(true);
                
                
//                GiaoDien giaoDien = new GiaoDien("Vi du Label");
//                giaoDien.setVisible(true);
            }
        });
    }
    
}
