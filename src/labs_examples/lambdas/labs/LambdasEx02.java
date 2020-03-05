package labs_examples.lambdas.labs;
import java.util.function.BiFunction;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.DoubleBinaryOperator;


public class LambdasEx02 {

    public static void main(String[] args) {


        Predicate<Integer> obj = num -> {
            if (num % 2 == 0) {
                return true;
            }
            return false;
        };

        boolean obj1 = obj.test(1981);
        System.out.println(obj1);


        DoubleBinaryOperator dbo = (double a, double b) -> a * b;
        System.out.println(dbo.applyAsDouble(3.1,6.9));


        Supplier<Double> random = () -> Math.random();
                System.out.println(random.get());

    }

}