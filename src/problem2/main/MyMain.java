package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem2.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        for (int i = 0; i < 9; i++) {
            tree.insertData((int) (Math.random() * 1000));
        }
        System.out.println("PreOrder Traversal : ");
        tree.preOrderTraverse();
        System.out.println("InOrder Traversal : ");
        tree.inOrderTraverse();
        System.out.println("PostOrder Traversal : ");
        tree.postOrderTraverse();
        System.out.println("Condition A : Root element is placed at opposite end," + "\n" +
                "i.e. in pre order root is the first element where as in post order root is the last element. is TRUE");
        System.out.println("Cond" +
                "ition B :They have common mid point,\n" +
                "i.e. both the traversal will give same element at the mid position for odd number of nodes. is FALSE");
    }
}

