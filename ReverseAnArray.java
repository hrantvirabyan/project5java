/**
 * Hrant Virabyan - Project 5 - ReverseAnArray - Mr. Riveira
 * The ReverseAnArray class is a program that prompts user for 10 numbers, saves it in an array. 
 * Using that array, it iterates backwards and saves it into a new reversed array. Finally, it displays
 * the reversed array to the user.
 *
 */

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to input 10 numbers and store them in an array numbers
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Call the reverseArray method to reverse the array
        double[] reversed = reverseArray(numbers);

        // Print out the reversed array below
        System.out.println("\nThe reversal of the input is:");
        for (double num : reversed) {
            System.out.print(num + " ");
        }

        input.close();
    }

    // Method to create a new reversed array by iterating backwards using [array.length - 1 - i]
    public static double[] reverseArray(double[] array) {
        double[] reversed = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}
