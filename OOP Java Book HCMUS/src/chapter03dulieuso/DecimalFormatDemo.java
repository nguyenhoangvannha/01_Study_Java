/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03dulieuso;

import static java.lang.System.out;
import java.text.DecimalFormat;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class DecimalFormatDemo {
    public static void main(String[] args) {
        int a = 55;
        int b = 3;
        float c  =  (float)a / b;
        DecimalFormat dcf = new DecimalFormat(".0");
        System.out.println(dcf.format(c));
    }
}
