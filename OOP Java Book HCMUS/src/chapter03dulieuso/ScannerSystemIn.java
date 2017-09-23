/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03dulieuso;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class ScannerSystemIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("Line separator:" + "'"+lineSeparator+"'");
        sc.useDelimiter(lineSeparator);
        System.out.println("Nhap vao ba so:");
        int num01 = sc.nextInt(), num02 = sc.nextInt(), num03 = sc.nextInt();
        System.out.println("Num01 = " + num01 + "\nNum02 = " + num02 + "\nNum03 = " + num03);
        sc.close();
    }
}
