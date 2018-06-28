/*
 * A driver to implement MyLink and MyListQueue class to create a queue linked list.
 */

/**
 *
 * @author Diep
 * @version 2/14/18
 */
import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) throws IOException {
        MyListQueue queue; //New reference for the queue    
        try (Scanner file = new Scanner(new File("Lab1InputFile.txt"))) { //file with relative file path to add items to queue
            queue = new MyListQueue(); //Only when file is found, create new queue
            MyLink temp; //Temporary pointer for new items
            while (file.hasNext()) { //loop to read the lines from file
                temp = new MyLink(file.next(), Integer.parseInt(file.next()));
                queue.enqueue(temp);
            }
        }
        System.out.println("Number of items in queue: " + queue.size()); //print out the number of items in queue
        System.out.println(queue.toString()); //print out info of the items

        queue.dequeue(); //dequeue an item
        queue.dequeue(); //dequeue another

        System.out.println("Number of items in queue: " + queue.size()); //print new size of queue
        System.out.println(queue.toString()); //print the items still in queue

    }

}
