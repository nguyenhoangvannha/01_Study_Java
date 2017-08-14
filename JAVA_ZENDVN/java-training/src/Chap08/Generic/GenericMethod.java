/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap08.Generic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class GenericMethod {
    public static void main(String[] args) {
        Integer arrInt[] = { 1, 2, 3, 4, 5, 6};
        String arrStr[] = {"HDT", "MMT", "CSDL"};
        
    }
    public static <T> void printArr(T[] arr) {
        for(T elm: arr){
            System.out.println(elm);
        }
    }
    public static void printArrInt(Integer arrInt[]) {
        for(Integer elm: arrInt) {
            System.out.println(elm);
        }    
    }
    public static void printArrStr(String arrStr[]) {
        for(String elm: arrStr) {
            System.out.println(elm);
        }
    }
}
