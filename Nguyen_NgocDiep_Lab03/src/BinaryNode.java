
/**
 * Class file for BinaryNode. Defines a node for a Binary Search Tree.
 *
 * @author Ngoc Diep Nguyen
 * @version 4/11/18
 */
public class BinaryNode {

    private int value; //value for the node
    private BinaryNode leftChild; //reference for left child
    private BinaryNode rightChild; //reference for right child

    /**
     * Creating a new node without any children.
     *
     * @param tempValue - Value the node holds
     */
    public BinaryNode(int tempValue) {
        this.value = tempValue;
        this.leftChild = null;
        this.rightChild = null;

    }

    /**
     * Method to return the value of the node.
     *
     * @return - Node's value.
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Method to return the location of left child.
     *
     * @return - Location of left child
     */
    public BinaryNode getLeftChild() {
        return this.leftChild;
    }

    /**
     * Method to return the value of left child.
     *
     * @return - Location of right child
     */
    public int getLeftChildValue() {
        return this.leftChild.getValue();
    }

    /**
     * Method to return the location of right child.
     *
     * @return - Location of right child
     */
    public BinaryNode getRightChild() {
        return this.rightChild;
    }

    /**
     * Method to return the value of right child
     * @return - Value of right child
     */
    public int getRightChildValue() {
        return this.rightChild.getValue();
    }
    /**
     * Create a left child from the current node.
     * @param tempChild - The node that will become the left child.
     */
    public void setLeftChild(BinaryNode tempChild) {
        this.leftChild = tempChild;
    }
    /**
     * Create a right child from the current node.
     * @param tempChild - The node that will become the right child.
     */
    public void setRightChild(BinaryNode tempChild) {
        this.rightChild = tempChild;
    }

}
