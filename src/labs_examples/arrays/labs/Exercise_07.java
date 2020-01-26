package labs_examples.arrays.labs;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
import java.util.ArrayList;

public class Exercise_07 {
    public static void main(String[] args) {
        // create new ArrayList of String

        ArrayList<String> list = new ArrayList();
        // add values to ArrayList
        list.add("Hello");
        list.add("World");
        list.add("!");
        // if the list is not empty
        if (!list.isEmpty()){
            // iterate over ever element in the ArrayList and print it
            for (String s : list){
                System.out.print(s + " ");
            }
        }
    }
}
