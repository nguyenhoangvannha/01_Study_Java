/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap03.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class ArrayMulti {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int row = 0,colum = 0;
        System.out.println("Nhap so hang va cot cua mang:");
        row = sc.nextInt();
        colum = sc.nextInt();
        System.out.printf("Row = %d Colum = %d %n",row,colum);
        int[][] arrInt = new int[row][colum];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < colum; j++){
                arrInt[i][j] = (int)(Math.random()*(row*colum + 1));
                //(int)(Math.random()*(Max - Min + 1)) + Min;
            }
        }
        System.out.println(Arrays.deepToString(arrInt));
        int sum = 0;
        for(int i = 0; i < colum; i++){
            sum += arrInt[0][i];
        }
        System.out.println("Tong hang 0 la: " + sum);
        sum = 0;
        for(int i = 0; i < row; i ++){
            sum += arrInt[i][i];
        }
        System.out.println("Tong duong cheo ma tran vuong la: " + sum);
        sc.close();
    }
    public static void elementAndPrint(){
        Scanner sc = new Scanner(System.in);
        int row = 0,colum = 0;
        System.out.println("Nhap so hang va cot cua mang:");
        row = sc.nextInt();
        colum = sc.nextInt();
        System.out.printf("Row = %d Colum = %d %n",row,colum);
        int[][] arrInt = new int[row][colum];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < colum; j++){
                arrInt[i][j] = (int)(Math.random()*(row*colum + 1));
                //(int)(Math.random()*(Max - Min + 1)) + Min;
            }
        }
        System.out.println(Arrays.deepToString(arrInt));
        for(int i = 0; i < colum; i++){
            System.out.print(" " + arrInt[i].length);
        }
    }
    public static void createArray() {
        int arrMulti[];
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu:");
        int length = sc.nextInt();
        System.out.println("Nhap tiep:");
        String temp = sc.nextLine();

        System.out.println(length + " " + temp);
        sc.close();
        
    }
}
