package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        /*for (int i = 0; i < 6; i++) {
            binarySearchTree.insert((int)(Math.random()*100));
            //binarySearchTree.insert(i+1);
        }*/
        binarySearchTree.insert(83);
        binarySearchTree.insert(38);
        binarySearchTree.insert(89);
        binarySearchTree.insert(23);
        binarySearchTree.insert(12);
        binarySearchTree.insert(21);
        binarySearchTree.insert(11);
        binarySearchTree.insert(85);
        binarySearchTree.insert(16);
        binarySearchTree.insert(17);
        binarySearchTree.insert(14);



        System.out.print("Elements of the binary search tree: ");
        binarySearchTree.traverse();
        System.out.print("\nLeft children of the binary search tree: ");
        binarySearchTree.traverseLeft();
        System.out.print("\nNo.of Parents not having their left child are: ");
        System.out.println(binarySearchTree.countLeft(binarySearchTree.getRoot()));

    }
}
