package problem4.main;

import problem2.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        for (int i = 0; i < 11; i++) {
            tree.insertData((int) (Math.random() * 100));
        }
        System.out.println("PreOrder Traversal : ");
        tree.preOrderTraverse();
        MyQueue queue = new MyQueue();
        queue.storePreOrderSuccessor(tree);
        queue.display();
    }
}