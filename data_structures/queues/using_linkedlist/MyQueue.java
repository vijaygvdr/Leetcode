package Leetcode.data_structures.queues.using_linkedlist;

import java.util.NoSuchElementException;

public class MyQueue {
    private int length;
    private MySinglyLinkedNode first;
    private MySinglyLinkedNode last;

    public MyQueue() {
        first = null;
        last = null;
        length = 0;
    }

    public int peek() {
        if(first==null) {
            throw new NoSuchElementException();
        }
        return first.getValue();
    }

    public void enqueue(int value) {
        MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
        if(length==0) {
            first = newNode;
        }
        else {
            last.setNext(newNode);
        }
        last=newNode;
        length++;
    }

    public void dequeue() {
        if(first==null) {
            throw new NoSuchElementException();
        }
        first = first.getNext();
        length--;
        if(length==0) {
            last = null;
        }
    }

    public void printQueue() {
        if(first == null) {
            return;
        }
        MySinglyLinkedNode currentNode = first;
        System.out.print(currentNode.getValue());
        currentNode = currentNode.getNext();
        while (currentNode != null) {
            System.out.print("-->" + currentNode.getValue());
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

}
