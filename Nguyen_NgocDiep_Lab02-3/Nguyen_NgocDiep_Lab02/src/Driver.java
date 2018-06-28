
/**
 * This is the code for Lab 2. A program to compute the power of integers from 1-20.
 * It will also handle exceptions when the the power of integer grow too large.
 *
 * @author Ngoc Diep Nguyen
 * @version 03/07/2018
 *
 */
public class Driver {

    //The method to start the program
    public static void main(String[] args) {

        //A loop to go through integers 1 to 20
        for (int i = 1; i <= 20; i++) {

            if (recursivePower(i, i, i - 1) == 0) {
                System.out.println(i + "^" + i + "= ERROR. TOO LARGE TO COMPUTE" + "\n"); //This will print out the numbers that are too large to compute.
            } else {
                System.out.println(i + "^" + i + "= " + recursivePower(i, i, i - 1) + "\n"); //ex: 2^2 = 4
            }
        }

    }

    /**
     * This method will recursively calculate the base number to the power of
     * itself, x^x.
     *
     * @param tempBase - The base integer. I.e 2, 3, 4..20.
     * @param tempResult - This will multiply the base integer.
     * @param tempPower - A count to make sure that the base integer is raised
     * to the power of itself. I.e. 2^2, 3^3...etc.
     * @return - An integer is returned. It can be the final number x^x or be
     * used as the tempResult for the recursive loop.
     */
    public static int recursivePower(int tempBase, int tempResult, int tempPower) {
        int result;//local varible to hold the result after multiplying the base number with the tempResult

        result = Math.multiplyExact(tempBase, tempResult); //Using multiplyExact to calculate the int value of base number and tempResult
        tempPower--; //subtracting the number of time the base number multiply itself. 

        //try catch to handle to ArithmeticException 
        try {
            if (tempPower <= 0) { //if the count is 0 or less, then the method can return the final result.
                return result;
            } else {
                result = recursivePower(tempBase, result, tempPower); //Recursively multiply the base integer by itself.
                return result;
            }
        } catch (ArithmeticException ex) {       //When ArithmeticException is thrown, method will return 0. 
                                                //This will be handled by the if statement in the main method.
            return 0;
        }
    }
}
