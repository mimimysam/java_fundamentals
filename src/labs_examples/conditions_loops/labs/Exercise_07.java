package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hint: there is a helpful method in the String class called charAt() that you'll want to use
 *
 */


public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputString = scanner.nextLine();

        for (int i=0; i<=inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                System.out.println('a');
            } else if (inputString.charAt(i) == 'e') {
                System.out.println('e');
            } else if (inputString.charAt(i) == 'i') {
                System.out.println('i');
            } else if (inputString.charAt(i) == 'o') {
                System.out.println('o');
            } else if (inputString.charAt(i) == 'u') {
                System.out.println('u');
            } else {
                System.out.println("no vowels");
            }
        }
    }
}