/**
 * Hrant Virabyan - Project 5 - IsArraySorted - Mr. Riveira
 * The IsArraySorted class is a program that prompts user a size of an array. The user then inputs the array.
 * The program then checks if the given array is in increasing order and prints the result. 
 *
 */
import java.util.Scanner;

public class IsArraySorted {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for the size of the array to input
        System.out.print("Enter the list size of the list: ");
        int size = input.nextInt();
        // Create the array to store the list elements
        int[] list = new int[size];
        // Ask the user for the integers for the array
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        // Print the size of the array and the array inputted by the user 
        System.out.print("The list has " + size + " integers ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        // Check if the list is sorted and display the result by using the inOrder method
        if (inOrder(list)) {
            System.out.println("This list is already sorted");
        } else {
            System.out.println("This list is not sorted");
        }

        input.close();
    }

    //method to see if the given array is in a increasing order
    public static boolean inOrder(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // If an element is greater than the next one, the list is not sorted
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true; // The list is sorted because all elements are greater than the predecessor 
    }
}
