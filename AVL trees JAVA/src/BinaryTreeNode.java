/**
 * this class creates nodes for a binary tree data structure.
 * @author MOTAUNG KARABELO
 * 17 April 2021
 */
public class BinaryTreeNode {
    /**
    *Represents student inforamtion. it includes student name and student key
    */
    StudentInformation data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    int height;

    /**
     *constructs and initializes all the field to create a binary tree.
     * @param data
     * @param left
     * @param right
     */
    public BinaryTreeNode ( StudentInformation data, BinaryTreeNode left, BinaryTreeNode right )
    {	
        this.data = data;
        this.left = left;
        this.right = right;
        height = 0;
    }

    /**
     *
     * @return returns the left node.
     */
    public BinaryTreeNode getLeft () { return left; }

    /**
     *
     * @return returns the right node.
     */
    public BinaryTreeNode getRight () { return right; }
}
