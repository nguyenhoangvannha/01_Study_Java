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
public class QuickInsertionSort extends Sort {
    private int[] data;
    private int threshold;
    public QuickInsertionSort(int[] data, int threshold){
        this.data = data;
        this.threshold = threshold;
    }
    public void sort(int left, int right){
        int pivot = (left + right) / 2;
	int i = left;
	int j = right;
	while (i <= j)
	{
		while (data[i] < data[pivot]) i++;
		while (data[j] > data[pivot]) j--;
		if (j >= i) {
			exchange(i,j);
			i++;
			j--;
		}
	}
	if (j > left){
            if((j - left) <= threshold){
                insertionsort(left, j);
            } else{
                sort(left, j);
            }
        } 
	if (i < right) {
            if((right - i) <= threshold){
                insertionsort(i, right);
            } else{
                sort(i, right);
            }
        }
    }
    public void exchange(int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    private void insertionsort(int low, int hight){
        for(int i = low; i < hight ; i++){
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
