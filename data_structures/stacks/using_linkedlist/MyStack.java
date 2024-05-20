package Leetcode.data_structures.stacks.using_linkedlist;

import java.util.EmptyStackException;

public class MyStack {

    private MySinglyLinkedNode top;
    private MySinglyLinkedNode bottom;
    private int length;

    public MyStack() {
        top = null;
        bottom = null;
        length = 0;
    }
    public void push(int valueToPush) {
        top = new MySinglyLinkedNode(valueToPush, top);
        if(length==0) {
            bottom = top;
        }
        length++;
    }

    public int peak() {
        if(length==0) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public int pop() {
        if(length==0) {
            throw new EmptyStackException();
        }
        MySinglyLinkedNode tempTop = top;
        top = top.getNext();
        length--;
        if(length==0) {
            bottom = null;
        }
        return tempTop.getValue();
    }

    public void printStack() {
        if(top == null) {
            return;
        }
        MySinglyLinkedNode currentNode = top;
        System.out.print(currentNode.getValue());
        currentNode = currentNode.getNext();
        while (currentNode != null) {
            System.out.print("-->" + currentNode.getValue());
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}
