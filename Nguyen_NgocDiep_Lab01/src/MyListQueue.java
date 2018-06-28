
/**
 * A class that will implements the MyLink class to create a linked-list queue.
 *
 * @author Ngoc Diep Nguyen
 * @version 02/14/2018
 */
public class MyListQueue {

    private MyLink front; //reference for the front of the queue
    private MyLink rear; //reference for the back of the queue

    /**
     * Default constructor for when there is no object in the queue.
     */
    public MyListQueue() {
        this.front = this.rear = null; //when there is nothing, both front and back is null  

    }

    /**
     * Method to add item to the list.
     *
     * @param temp - MyLink - For passing in the a new link into the list.
     */
    public void enqueue(MyLink temp) {
        if (this.front == null && this.rear == null) { // when the link is empty & the first link is being added, front & back pouints to the same object
            this.front = this.rear = temp;
        } else {
            this.rear.next = temp; //the "next" field now has the location of temp(the to be new link)
            this.rear = temp; //rear is now pointed to the new link 
        }
    }

    /**
     * Method to remove item from list
     *
     */
    public void dequeue() {
        MyLink temp;
        if (this.front == null) {
            System.out.println("No item in the queue."); //Out put a message to notify user when there's no item in queue

        } else if ((this.front == this.rear) && (this.front != null)) { //when there is only one item in the queue.
            this.front = this.rear = null;

        } else {
            temp = this.front.next; //hold the location of the next link
            this.front = temp; //points to the next link
        }
    }

    /**
     * Method to count the number of items/links in queue
     *
     * @return int - the number of items/links in queue
     */
    public int size() {
        MyLink temp; //holds a temporary reference to the see if link is connected to another link
        if (this.front == null) {
            return 0;
        } else if ((this.front == this.rear) && (front != null)) { //when there is only one item
            return 1;
        } else { //when there is more than one item
            int size = 1; 
            temp = this.front;
            while (temp.next != null) {
                size++;
                temp = temp.next;
            }
            return size;
        }

    }

    /**
     * Method to return a textual representation of the items/links in the
     * queue.
     *
     * @return String - Info on all the items/links in queue
     *
     */
    public String toString() {
        MyLink temp;
        String s;
        if (this.front == null) {
            return "No item in queue.";
        } else {
            temp = this.front;
            s = temp.toString();
            while (temp.next != null) {
                temp = temp.next;
                s += "\n" + temp.toString();
            }
            return s;
        }

    }

}
