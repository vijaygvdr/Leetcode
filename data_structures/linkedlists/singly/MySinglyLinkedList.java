package Leetcode.data_structures.linkedlists.singly;

public class MySinglyLinkedList {

    private MySinglyLinkedNode head;

    private MySinglyLinkedNode tail;

    private int length;

    public MySinglyLinkedList(int value) {
        head = new MySinglyLinkedNode(value);
        tail = head;
        length = 1;
    }

    public void prepend(int value) {
        head = new MySinglyLinkedNode(value, head);
        length ++;
    }

    public void append(int value) {
        MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
        tail.setNext(newNode);
        tail = newNode;
        length ++;
    }

    public void printList() {
        if(head == null) {
            return;
        }
        MySinglyLinkedNode currentNode = head;
        System.out.println(currentNode.getValue());
        currentNode = currentNode.getNext();
        while(currentNode != null) {
            System.out.println("-->" + currentNode.getValue());
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public void insert(int index, int value) {
        index = wrapIndex(index);
        if(index==0) {
            prepend(value);
            return;
        }
        if(index==length-1) {
            append(value);
            return;
        }
        MySinglyLinkedNode leader = traverseToIndex(index-1);
        MySinglyLinkedNode nextNode = leader.getNext();

        MySinglyLinkedNode newNode = new MySinglyLinkedNode(value,nextNode);

        leader.setNext(newNode);

        length++;
    }

    public void remove(int index) {
        index = wrapIndex(index);
        if(index==0) {
            head = head.getNext();
            length--;
            return;
        }

        MySinglyLinkedNode leader = traverseToIndex(index-1);
        MySinglyLinkedNode unwantedNode = leader.getNext();
        leader.setNext(unwantedNode.getNext());
        length --;
    }

    public void reverse() {
        MySinglyLinkedNode first = head;
        tail = head;
        MySinglyLinkedNode second = first.getNext();
        for(int i = 0; i < length; i++) {
            MySinglyLinkedNode temp = second.getNext();
            second.setNext(first);
            first = second;
            second = temp;
        }
        head.setNext(null);
        head=first;
    }

    public MySinglyLinkedNode traverseToIndex(int index) {
        index = wrapIndex(index);
        MySinglyLinkedNode currentNode = head;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public int wrapIndex(int index) {
         return Math.max(Math.min(index, length -1),0);
    }
}
