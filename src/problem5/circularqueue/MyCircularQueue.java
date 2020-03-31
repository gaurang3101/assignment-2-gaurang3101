package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyCircularQueue() {
        front = null;
        rear = null;
        size = 0;
    }
}