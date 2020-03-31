package problem4.myqueue;
// to create queue to store pre - order successor

import problem2.mybst.MyBinarySearchTree;
import problem2.node.TreeNode;
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

    public void storePreOrderSuccessor(MyBinarySearchTree tree) {
        TreeNode root = tree.getRoot();
        storePreOrderSuccesssorRec(root);
    }

    void storePreOrderSuccesssorRec(TreeNode root) {
        if (root != null) {
            enqueue(root.getData());
            storePreOrderSuccesssorRec(root.getLeft());
            storePreOrderSuccesssorRec(root.getRight());
        }
    }


    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }


    public void enqueue(int element) {
        QueueNode node = new QueueNode(element);
        if (isEmpty()) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }


    public QueueNode dequeue() {
        QueueNode response = null;
        if (!isEmpty()) {
            if (front.getNext() != null) {
                response = front;
                front = front.getNext();
                response.setNext(null);
                size--;
            } else {
                response = front;
                front = null;
                rear = null;
                size--;
            }
        } else {
            System.out.println("Queue UnderFlow");
        }
        return response;

    }

    public QueueNode peek() {
        QueueNode response = null;
        if (!isEmpty()) {
            response = new QueueNode(front.getData());
        }
        return response;
    }


    public void display() {
        System.out.print("Display Queue: ");
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.getData());
            if (temp.getNext() != null) {
                System.out.print("<---");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }

    public QueueNode rear() {
        return rear;
    }
}
