/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap08.generic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class GenericMethod {
    public static void main(String[] args) {
        Integer[] arrInt = {10,20,30,40,50};
        String[] arrStr = {"Java", "Android", "C sharp", "C plus plus"};
        printArray(arrStr);
    }
    public static <Kieu> void  printArray (Kieu[] arr){
        for (Kieu elm: arr){
            System.out.println(elm);
        }
    }
}
