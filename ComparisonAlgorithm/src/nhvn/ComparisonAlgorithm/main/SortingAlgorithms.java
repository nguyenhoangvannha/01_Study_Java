/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhvn.ComparisonAlgorithm.main;

import nhvn.ComparisonAlgorithm.algorithm.InsertionSort;
import nhvn.ComparisonAlgorithm.algorithm.MergeSort;
import nhvn.ComparisonAlgorithm.algorithm.QuickInsertionSort;
import nhvn.ComparisonAlgorithm.algorithm.QuickSort;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class SortingAlgorithms{
    public SortingAlgorithms(int[] array) {
        this.array = array;
    }
    private int[] array;
    private int threshold;

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public String insertionSort() {
        int[] temp = copyData();
        long start = getTime();
        InsertionSort algorithm = new InsertionSort(temp);
        algorithm.sort();
        long end = getTime();
//        System.out.println("End: " + end);
        long duration = end - start;
        if (duration < 5000000) {
            return duration + " ns";
        } else {
            return (long) (duration / 1000000) + " ms";
        }
    }

    public String mergeSort() {
        int[] temp = copyData();
//        display(temp);
        long start = getTime();
        MergeSort algorithm = new MergeSort(temp);
        algorithm.sort(0, temp.length - 1);
        long end = getTime();
        long duration = end - start;
        if (duration < 5000000) {
            return duration + " ns";
        } else {
            return (long) (duration / 1000000) + " ms";
        }
    }

    public String quickSort() {
        int[] temp = copyData();
        long start = getTime();
        QuickSort algorithm = new QuickSort(temp);
        algorithm.sort(0, temp.length - 1);
        long end = getTime();
        long duration = end - start;
        if (duration < 5000000) {
            return duration + " ns";
        } else {
            return (long) (duration / 1000000) + " ms";
        }
    }

    public String quickInsertionSort() {
        int[] temp = copyData();
        long start = getTime();
        QuickInsertionSort algorithm = new QuickInsertionSort(temp, getThreshold());
        algorithm.sort(0, temp.length - 1);
        long end = getTime();
        long duration = end - start;
        if (duration < 5000000) {
            return duration + " ns";
        } else {
            return (long) (duration / 1000000) + " ms";
        }
    }

    public long getTime() {
        return System.nanoTime();
    }

    private int[] copyData() {
        int[] temp = new int[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);
        return temp;
    }

//    public static void main(String[] args) {
//        int size = 2000;
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * array.length * array.length);
//        }
//        SortingAlgorithms sort = new SortingAlgorithms(array);
//    }
}
