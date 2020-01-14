package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        byte height = 5;

        double surface_area = 2 * Math.PI * radius * (radius + height);
        double volume = Math.PI * radius * radius * height;

        System.out.println("Surface area = " + surface_area);
        System.out.println("Volume = " + volume);

    }
}
