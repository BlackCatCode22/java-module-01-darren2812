// FunWithVariables.java
// dD 8/14/2025

import java.util.Scanner;

public class FunWithVariables {
    public static void main(String[] args) {
        // Opening note
        System.out.println("Welcome to my Fun With Variables Program!\n");

        // Creating the Scanner object
        Scanner input = new Scanner(System.in);

        // Request user for input and assigns the input to num1 and num2
        System.out.println("Input your first number: ");
        int num1 = input.nextInt();
        System.out.println("Input your second number: ");
        int num2 = input.nextInt();

        // Create the answer variable
        int answer = num1 + num2;

        // Prints the answer to the console
        System.out.println("\nThe answer is " + answer);

        // Scanner code learned from W3 schools: https://www.w3schools.com/java/java_user_input.asp
    }
}
