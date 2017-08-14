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
public class QuickSort extends Sort {
    private int[] data;
    public QuickSort(int[] data){
        this.data = data;
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
	if (j > left) sort(left, j);
	if (i < right) sort(i, right);
    }
    public void exchange(int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
