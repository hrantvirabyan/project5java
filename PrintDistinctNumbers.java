/**
 * Hrant Virabyan - Project 5 - PrintDistinctNumbers - Mr. Riveira
 * The PrintDistinctNumbers class is a program that prompts user for 10 numbers, saves it in an array. 
 * Using that array, it counts the number of unique numbers present in the array and prints a new array of those 
 * unique numbers. 
 *
 */
import java.util.Scanner;

public class PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        // Array to store the unique numbers entered by the user
        int[] uniqueNumbersArray = new int[10];
        // Counter for the number of unique numbers
        int uniqueCount = 0;
        // Prompt the user to input the 10 numbers and store it in an array
        System.out.print("Enter ten numbers: ");
        for (int index = 0; index < 10; index++) {
            int currentNumber = userInputScanner.nextInt();

            // Check if the current number is already in the array. Use the helper function to to make 
            // program more efficient
            if (!isNumberPresent(uniqueNumbersArray, uniqueCount, currentNumber)) {
                uniqueNumbersArray[uniqueCount] = currentNumber;
                uniqueCount++;
            }
        }

        // Print the number of distinct numbers in the numbers given
        System.out.println("The number of distinct numbers is " + uniqueCount);

        // Print an array of distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbersArray[i] + " ");
        }

        userInputScanner.close();
    }

    // Helper method to check if a number is already in the array
    private static boolean isNumberPresent(int[] numbersArray, int count, int numberToCheck) {
        for (int i = 0; i < count; i++) {
            if (numbersArray[i] == numberToCheck) {
                return true;
            }
        }
        return false;
    }
}
