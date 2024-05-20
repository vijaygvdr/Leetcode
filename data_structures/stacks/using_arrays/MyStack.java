package Leetcode.data_structures.stacks.using_arrays;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack {
    private List<Integer> array = new ArrayList<>();
    public MyStack() {
    }

    public void push(int valueToPush) {
        array.add(valueToPush);
    }

    public int peak() {
        if(array.size()==0) {
            throw new EmptyStackException();
        }
        return array.get(this.array.size()-1);
    }

    public int pop() {
        if(array.size()==0) {
            throw new EmptyStackException();
        }
        return array.remove(array.size()-1);
    }

    public void printStack() {
        for (int value : array) {
            System.out.println(value);
        }
    }

}
