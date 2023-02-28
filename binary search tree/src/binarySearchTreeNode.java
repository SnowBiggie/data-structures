/**
 * this class creates nodes for a binary search tree data structure.
 */
public class binarySearchTreeNode {

    public StudentInformation data;
    public binarySearchTreeNode left;
    public binarySearchTreeNode right;

    /**
     * this method constructs and initializes all the field being used by binary search tree.
     * @param data
     * @param left
     * @param right
     */
    public binarySearchTreeNode(StudentInformation data, binarySearchTreeNode left, binarySearchTreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * @return returns the left data of the tree
     */
    public binarySearchTreeNode getLeft() {
        return left;
    }

    /**
     * @return returns the right data of the tree
     */
    public binarySearchTreeNode getRight() {
        return right;
    }
}
