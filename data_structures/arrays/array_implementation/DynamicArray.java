package data_structures.arrays.array_implementation;

import java.util.Arrays;
public class DynamicArray {
    private String[] array;
    private int capacity;
    private int currentLength;

    public DynamicArray() {
        array = new String[1];
        capacity = 1;
        currentLength = 0;
    }

    public String get(int index) {
        if (index > -1 && index < currentLength)
            return this.array[index];
        else return "Index Out Of Bound";
    }

    public void push(String string) {
        if (currentLength == capacity) {
            String[] tempArray = new String[2 * capacity];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
            capacity *= 2;
        }
        array[currentLength] = string;
        currentLength++;
    }

    public void replace(int index, String value) {
        if (index > -1 && index < currentLength) {
            array[index] = value;
        } else
            System.err.println("Index out of bounds");
    }

    public void pop() {
        if (currentLength > 0) {
            currentLength--;
        }
    }

    public void delete(int index) {
        if (index > -1 && index < currentLength) {
            if (index == currentLength - 1) {
                pop();
            } else {
                for (int i = index; i < currentLength; i++) {
                    array[i] = array[i + 1];
                }
                currentLength--;
            }
        } else {
            System.err.println("Index out of bounds");
        }
    }

    public String[] getArray() {
        String[] tempArr = new String[currentLength];
        for (int i = 0; i < currentLength; i++) {
            tempArr[i] = array[i];
        }
        return tempArr;
    }

    public int length() {
        return currentLength;
    }
}
