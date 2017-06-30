/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhvn.ComparisonAlgorithm.algorithm;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class InsertionSort extends Sort {
    private int[] data; 
    public InsertionSort(int[] data){
        this.data = data;
    }
    public void sort(){
        for(int i = 1; i < data.length ; i++){
            int key = data[i];
            int j = i - 1;
            while(j != 0 && data[j] > key){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }
}
