
package problem4.myqueue;
// to create queue to store pre - order successor


import problem4.node.QueueNode;

public class MyQueue {
    private QueueNode rear;
    private QueueNode front;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }
}
