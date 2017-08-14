/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap03.Array;

import java.util.Arrays;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class ArrayClass {
    public static void main(String[] args) {
        arrayToString();
    }
    public static void arrayToString(){
        String arrString[] = {"Nguyen","Hoang","Van","Nha"};
        System.out.println(Arrays.toString(arrString));
    }
    public static void sortArray(){
        int[] arrInt = {3,1,5,2,6,4};
        System.out.println("Array Int: " + Arrays.toString(arrInt));
        
        //Tang dan
        Arrays.sort(arrInt);
        System.out.println("Array Int: " + Arrays.toString(arrInt));
        
    }
    public static void copyArrayRange(){
        String arrString[] = {"Nguyen","Hoang","Van","Nha"};
        String[] newArr = Arrays.copyOfRange(arrString, 0, 1);
        System.out.println(newArr[0]);
        System.out.println(newArr.length);
    }
    public static void copyArray(){
        String arrString[] = {"Nguyen","Hoang","Van","Nha"};
        String newArr[] = Arrays.copyOf(arrString, 5);
        newArr[4] = "La ta";
        System.out.println(newArr[4]);
    }
}
