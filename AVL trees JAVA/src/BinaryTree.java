import java.util.*;
/**
 *A tree node for any binary tree implemented
 * @author MOTAUNG KARABELO
 * 19 April 2021
 */
public class BinaryTree {
    BinaryTreeNode root;

    /**
     * constructs and initializes a binary tree
     */
    public BinaryTree ()
    {
        root = null;
    }

    /**
     *calculates the height of a binary tree
     * @return returns the height of the tree
     */
    public int getHeight ()
    {
        return getHeight (root);
    }
    
    /**
    *claculates the height of a binary tree starting from a given node
    *@param node node is the starting point for calculating height
    *@return returns -1 if the node is null or height of the binary tree starting from the node 
    */
    private int getHeight ( BinaryTreeNode node )
    {
        if (node == null)
            return -1;
        else
            return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ()));
    }

    /**
     * Calculates the size of the tree
     * @return returns the size of the tree
     */
    public int getSize ()
    {
        return getSize (root);
    }
    /**
    *claculates the size of a binary tree starting from a given node
    *@param node node is the starting point for calculating size
    *@return returns 0 if the node is null or size of the binary tree starting from the node
    */
    private int getSize ( BinaryTreeNode node )
    {
        if (node == null)
            return 0;
        else
            return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
    }
    /**
    *prints out the data at a given node
    *@param node node is the node being visited
    */
    private void visit ( BinaryTreeNode node )
    {
        System.out.println (node.data);
    }

    /**
     * Prints the data of the tree using the inOrder traversal.
     */
    public void printAllStudents ()
    {
        inOrder (root);
    }
    /**
    *represent inOrder traversal of a binary tree
    */
    private void inOrder ( BinaryTreeNode node )
    {
        if (node != null)
        {
            inOrder (node.getLeft ());
            visit (node);
            inOrder (node.getRight ());
        }
    }
}
