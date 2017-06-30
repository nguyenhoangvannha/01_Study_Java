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
public class MergeSort extends Sort{
    private int[] data;
    private int[] temp;
    public MergeSort(int[] data){
        this.data = data;
        temp = new int[data.length];
    }
    public void sort(int left, int right){
       if (right > left)
	{
		int mid;
		mid = (left + right) / 2;
		sort(left, mid);
		sort( mid + 1, right);
		Merge(left, mid, right);
	}
    }
    private void Merge(int left, int mid , int right){
        int i = left;
	int j = mid + 1;

	temp = new int[right - left + 1];

	for (int k = 0; k <= right - left; k++)
	{
		if (data[i] < data[j])
		{
			temp[k] = data[i];
			i++;
		}
		else
		{
			temp[k] = data[j];
			j++;
		}
		if (i == mid + 1)
		{
			while (j <= right)
			{
				k++;
				temp[k] = data[j];
				j++;
			}
			break;
		}
		if (j == right + 1)
		{
			while (i <= mid)
			{
				k++;
				temp[k] = data[i];
				i++;
			}
			break;
		}
	}

	for (int k = 0; k <= right - left; k++)
		data[left + k] = temp[k];
    }
}
