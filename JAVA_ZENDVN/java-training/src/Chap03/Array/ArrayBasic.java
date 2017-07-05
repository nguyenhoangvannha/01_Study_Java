/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap03.Array;

import java.util.Scanner;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class ArrayBasic {
    public static void main(String[] args) {
        nhapMang();
    }
    public static void sumMaxMin(){
        int arrOne[] = {1,3,2,5};
        
    }
    public static void nhapMang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length:");
        int leng = sc.nextInt();
        sc.nextLine();
        int[] arrOne = new int[leng];
        for(int i = 0; i < leng; i++){
            System.out.printf("Phan tu %d:", i);
            arrOne[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        for(int i =0; i < leng; i ++){
            System.out.printf("Item %d: %d %n ",i, arrOne[i]);
        }
    }
    public static void khaiBao(){
        //Khai bao mang
        int[] arrOne ;
        int arrTwo;
        //System.out.println("arrOne: " + arrOne[0]);
        //Khai bao mang va cap vung nho
        int[] arrThree = new int[5];
        for(int i =0; i < 5; i++){
            System.out.println(arrThree[i]);
        }
    }
}
