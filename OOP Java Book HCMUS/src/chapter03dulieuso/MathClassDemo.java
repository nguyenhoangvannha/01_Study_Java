/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03dulieuso;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MathClassDemo{
    public static void main(String[] args) {
        System.out.println(Math.PI);
        int max = 1000;
        int min = 890;
        int random = (int) (Math.random() *(max - min + 1)) + min;
        System.out.println("random:" + random);
    }
}
