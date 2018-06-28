
/**
 *Driver for Lab 03. The start of the program where input data are entered.
 *
 * @author Ngoc Diep nguyen
 * @version 4/11/18
 */
import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) throws IOException {
        BSTTree tree; //Create a reference for a BSTTree 
        int data; //Data for node
        int target;//Value to search for
        
        //Go through the payload file
        try (Scanner input = new Scanner(new File("BSTInput.txt"))) {
            tree = new BSTTree(); //New instance of BSTTree.            
            while (input.hasNext()) {
                data = Integer.parseInt(input.next());
                tree.insert(data);
            }
        }
        
        System.out.println("List of values entered:\n" + tree.toString());//Prints out list of inputs
        System.out.println("Number of nodes: " + tree.size());//prints out number of nodes
        
        //Go through the search fil
        try (Scanner search = new Scanner(new File("BSTTreeSearch.txt"))) {
            while (search.hasNext()) {
                target = Integer.parseInt(search.next());
                tree.search(target);
            }
        }

        

    }
}
