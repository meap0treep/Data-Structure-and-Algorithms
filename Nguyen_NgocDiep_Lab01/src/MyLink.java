
/**
 * A class to define the objects that will go into the a queue list.
 *
 * @author Ngoc Diep Nguyen
 * @version 02/14/18
 */
public class MyLink {

    private String name; //The name of object.
    private int age;//Age of the object
    protected MyLink next; //Reference variable to point to the next object in the linked list.

    /**
     * The default constructor for the class.
     */
    public MyLink() {
        name = "";
        age = 0;
        next = null;
    }

    /**
     * Constructor with arguments.
     *
     * @param tempName- String- For the name of the object.
     * @param tempAge- int - For the age of the object.
     */
    public MyLink(String tempName, int tempAge) {
        name = tempName;
        age = tempAge;
        next = null;
    }

    /**
     * Method to return a textual representation of the object.
     *
     * @return String - the info of the object.
     */
    public String toString() {
        return "Name: " + this.name+ "\nAge: " + this.age;
    }
}
