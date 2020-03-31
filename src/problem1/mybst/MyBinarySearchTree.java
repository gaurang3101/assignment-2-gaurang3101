package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E extends Comparable<E>> {
    private TreeNode root;
    private int levels = 0;

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }


    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode current = root;
            TreeNode parent = null;
            while (current != null) {
                parent = current;
                if (node.getData() < current.getData()) {
                    current = current.getLeft();
                } else {
                    current = current.getRight();
                }
            }
            if (node.getData() < parent.getData()) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    public int countLeft(TreeNode rootNode) {
        int count = 0;
        if (rootNode != null) {
            int countLn = 0;
            int countL = 0;
            int countLR = 0;
            if (rootNode.getLeft() == null) {
                countLn = count + 1;
            } else {
                TreeNode temp = rootNode.getLeft();
                countL = count + countLeft(temp.getLeft()) +
                        countLeft(temp.getRight());

            }
            if (rootNode.getRight() != null) {
                TreeNode temp2 = rootNode.getRight();
                countLR = countLeft(temp2.getLeft()) +
                        countLeft(temp2.getRight());
            }

            count = countLn + countL + countLR;
            return count;
        }
        return count;
    }



    int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lHeight = height(root.getLeft());
            int rHeight = height(root.getRight());

            if (lHeight > rHeight) {
                return (lHeight + 1);
            } else {
                return (rHeight + 1);
            }
        }
    }

    void printGivenLevel(TreeNode root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getData() + " ");
        else if (level > 1) {
            printGivenLevel(root.getLeft(), level - 1);
            printGivenLevel(root.getRight(), level - 1);
        }
    }

    void printLeft(TreeNode root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getData() + " ");
        else if (level > 1) {
            printGivenLevel(root.getLeft(), level - 1);
        }
    }

    public void traverseLeft() {
        setLevels(height(root));
        for (int i = 2; i <= levels; i++) {
            printLeft(root, i);
        }
    }

    public void traverse() {
        setLevels(height(root));
        for (int i = 1; i <= levels; i++) {
            printGivenLevel(root, i);
        }


    }
}
