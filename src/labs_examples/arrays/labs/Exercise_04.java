package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int array[][] = { {15, 25, 35},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50, 51, 89},
        };


        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
