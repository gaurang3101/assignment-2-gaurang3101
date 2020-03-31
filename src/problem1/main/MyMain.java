package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        for (int i = 0; i < 6; i++) {
            binarySearchTree.insert((int)(Math.random()*100));
        }
        System.out.print("Elements of the binary search tree: ");
        binarySearchTree.traverse();
        System.out.print("\nLeft children of the binary search tree: ");
        binarySearchTree.traverseLeft();
        System.out.print("\nNo.of Parents not having their left child are: ");
        System.out.println(binarySearchTree.countLeft(binarySearchTree.getRoot()));

    }
}
