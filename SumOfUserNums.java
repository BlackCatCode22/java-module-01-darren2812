// SumOfUserNums.java
// dD 08/19/25

// importing the Scanner
import java.util.Scanner;

public class SumOfUserNums {
    public static void main(String[] args) {
            // Opening message
            System.out.println("Enter three integers that you want to add together!");

            // Prints the sum message and calls the sum function
            System.out.print("The sum of all three integers is: " + sumAllInts());
    }

    static int sumAllInts(){
        // Creating new Scanner called "input"
        Scanner input = new Scanner(System.in);

        // Asks user to input three integers
        System.out.print("Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Number 2: ");
        int num2 = input.nextInt();
        System.out.print("Number 3: ");
        int num3 = input.nextInt();

        return num1 + num2 + num3;
    }
}