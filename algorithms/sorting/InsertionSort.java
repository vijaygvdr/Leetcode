package Leetcode.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

    public ArrayList<Integer> insertionSort(ArrayList<Integer> array) {
        for(int i=0; i< array.size(); i++) {
            if(array.get(i) <= array.getFirst()) {
                array.addFirst(array.remove(i));
            }
            else {
                if(array.get(i) < array.get(i - 1)) {
                    for(int j = 1; j < i; j++) {
                        if(array.get(i) < array.get(j)) {
                            array.add(j, array.remove(i));
                            break;
                        }
                    }
                }

            }
        }
        return array;
    }

    public static void main(String[] args) {
        InsertionSort insSort = new InsertionSort();
        System.out.println(insSort.insertionSort(insSort.numbers));
    }


}
