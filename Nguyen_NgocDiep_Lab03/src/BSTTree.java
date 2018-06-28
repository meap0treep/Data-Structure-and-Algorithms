
/**
 * Class file for BSTTree. Defines the structure of the Binary Search Tree.
 *
 * @author Ngoc Diep Nguyen
 * @version 4/11/18
 *
 */
public class BSTTree {

    private String details = "";//For keeping track of values entered
    private int scount; //keeps the number of comparison it takes to find target value
    private int count; //Keeps count of how many nodes.
    private BinaryNode root; //Keeps track of the root.

    /**
     * Constructor to initialize the BSTTree without any nodes.
     */
    public BSTTree() {
        root = null;
        count = 0;
    }

    /**
     * Method to insert new nodes into the tree
     *
     * @param value - the data of the new node.
     */
    public void insert(int value) {
        root = addNode(value, root); //starting from the root
        count++;//increments each time new node is added
    }

    /**
     * Private method for adding new node.
     *
     * @param value - The data of the new node.
     * @param node - Current node to add children or input the data
     * @return - returns the current node
     */
    private BinaryNode addNode(int value, BinaryNode node) {
        if (node == null) {//if root is null, create new root
            node = new BinaryNode(value);
            details += node.getValue() + "\n";//Keeps track of values entered
        } else {//if node is valid, add children
            if (value < node.getValue()) { //adding left child
                node.setLeftChild(addNode(value, node.getLeftChild()));
            } else if (value >= node.getValue()) { //adding right child
                node.setRightChild(addNode(value, node.getRightChild()));
            }
        }
        return node;//return node if node is valid for recursive function
    }

    /**
     * Method to search for target value in BST Tree.
     *
     * @param value - The target value to search for.
     */
    public void search(int value) {
        scount = 0; //Reset the comparison count for each target.
        if ((searchNode(value, root)) == false) {//when target is not found
            System.out.println("\nValue searching for: " + value);
            System.out.println("DID NOT FIND");
            System.out.println("Number of comparison: " + scount);
        } else {//when target is found
            System.out.println("\nValue searching for: " + value);
            System.out.println("FOUND");
            System.out.println("Number of comparison: " + scount);
        }

    }

    /**
     * Private method to recursively search for target.
     *
     * @param value - Target value.
     * @param node - Current node to compare to.
     * @return - Return whether node is same as target or not.
     */
    private boolean searchNode(int value, BinaryNode node) {
        scount++; //increment every time a comparison is made.
        if (node == null) {//when target is not found
            scount--; //Since the node is null, meaning it does not exist, do not add to count. 
            return false;
        } else {
            if (node.getValue() == value) { //returns true when target is found.
                return true;
            } else if (node.getValue() >= value) { //move down to the left child if target less than node
                return searchNode(value, node.getLeftChild());
            } else { //move down to right child if target is greater than node
                return searchNode(value, node.getRightChild());
            }

        }

    }

    /**
     * Method to return the details of values entered.
     *
     * @return - List of values entered.
     */
    public String toString() {
        return details;
    }

    /**
     * Method to return whether tree is empty or not.
     *
     * @return
     */
    public boolean isEmpty() {
        if (root == null) { //as long as root is not null then tree is not empty
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method to return the location of the root.
     *
     * @return - The location of root.
     */
    public BinaryNode getRoot() {
        return this.root;
    }
    /**
     * Method to return the root's value.
     * @return - Root's value.
     */
    public int getRootValue() {
        return this.root.getValue();
    }

    /**
     * Method to return the number of nodes
     * @return - Number of nodes in tree.
     */
    public int size() {
        return count;
    }

}
