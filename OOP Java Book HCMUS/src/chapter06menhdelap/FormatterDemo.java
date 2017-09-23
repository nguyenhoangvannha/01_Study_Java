/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06menhdelap;

import java.util.Formatter;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FormatterDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        formatter.format("%3d + %4d = %5d", 1,11,12);
        String outString = String.format("%2.4f + %3.6f + %4.7f", 1.6, 3.66, 6.555);
        System.out.println(outString);
    }
}
