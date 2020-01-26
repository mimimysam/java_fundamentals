package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number: ");
        int num3 = scanner.nextInt();

        int[] numbers = {num1, num2, num3};

        int sum = 0;

        //nums[3] = 17;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        float average = sum / numbers.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);

    }

}