
package problem1.mybst;
import problem1.node.TreeNode;
// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private int countRight;

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root==null){
            root=node;
        }
        else{
            TreeNode current=root;
            TreeNode parent = null;
            while(current!=null){
                parent=current;
                if(node.getData()<current.getData()){
                    current=current.getLeft();
                }
                else{
                    current=current.getRight();
                }
            }
            if(node.getData()<parent.getData()){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

}
