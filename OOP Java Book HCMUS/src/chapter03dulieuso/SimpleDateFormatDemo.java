/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03dulieuso;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss");
        System.out.println("Now:" + sdf.format(today));
        JOptionPane.showMessageDialog(null, "Now:\n" + sdf.format(today), "Get time", JOptionPane.INFORMATION_MESSAGE);
    }
}
