// IntComparison.java
// dD 08/21/25

// Reference: W3 Schools for Scanner and Google AI Overview on implementing new array to
// create an array with a specified size

// importing the Scanner
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){
        // asks the user how many integers they want to compare
        System.out.println("How many integers do you want to compare? ");
        // creates the scanner object
        Scanner input = new Scanner(System.in);
        int numbersToCompare = input.nextInt();
        // creates an array of a specified size according how many integers are compared
        int[] numbers = new int[numbersToCompare];
        // iterates to ask for user input
        for (int i = 0; i < numbersToCompare; i++){
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        // prints output message and calls out the compareInts function
        System.out.println("The largest integer is " + compareInts(numbers, numbersToCompare));
    }

    static int compareInts(int[] nums, int size){
        // sets the largest integer to the first element in the array
        int largest = nums[0];
        // iterates through the array and replaces largest if the next element in the array is larger
        for (int i = 0; i < size-1; i++){
            if (nums[i] < nums[i+1]){
                largest = nums[i+1];
            }
        }
        // returns the largest number
        return largest;
    }
}

