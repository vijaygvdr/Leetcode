package Leetcode.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j=0; j < array.length - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort bsort = new BubbleSort();
        System.out.println(Arrays.toString(bsort.bubbleSort(new int[]{2,5,1,7})));
    }
}
