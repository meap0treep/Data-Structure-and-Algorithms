
/**
 * A program to sort set of integers in ascending and descending order.
 *
 * @author Ngoc Diep Nguyen
 * @version 04/26/2018
 */
import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) throws IOException {

        ArrayList set = new ArrayList(); //reference variable to hold the set of integers read from file
        TreeSet asc;
        TreeSet des;

        //Reading the integers from file
        try (Scanner input = new Scanner(new File("Lab4InputFile.txt"))) {
            while (input.hasNext()) {
                set.add(Integer.parseInt(input.next()));
            }
        }

        asc = new TreeSet(set); //creating a new TreeSet instance fr ascending/natural order, not empty

        des = new TreeSet(new MyComparator());//creating a new TreeSet instance for descending 
        //order using the MyComparator class, curently empty

        des.addAll(set);//Adding the elements to the empty oject. 

        System.out.println("List of integers in file: \n" + set);//Listing the integers from original set 
        System.out.println("Number of integers: " + set.size()); //Number of integers in original set
        System.out.println("List in ascending order: \n" + asc); //Lists integers in natural order
        System.out.println("List in descending order: \n" + des);//Lists integers in descending order

    }
}

/**
 * An inner class that implements the Comparator interface.
 * @param Integer a - Integer being compared to
 * @param Integer b - Integer being compared
 * @return Integer - Returns 0 if a = b; -1 if a < b; 1 if a< b;
 */
class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        if (a == b) {
            return 0;
        } else if (a > b) {
            return -1;
        } else {
            return 1;
        }

    }
}
