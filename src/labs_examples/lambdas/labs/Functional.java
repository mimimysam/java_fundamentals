package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 */

public class Functional {

    @FunctionalInterface
    public interface MyFunctionalInterface {
        void method();
    }

    @FunctionalInterface
    public interface AnotherFunctInter {
        double half(double a);
    }

    @FunctionalInterface
    public interface TwoParameters {
        int difference(int x, int y);
    }

}

class Interface {

    public static void main(String[] args) {
        Functional.MyFunctionalInterface obj = new Functional.MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("This is printing from the Anonymous Inner Class");
            }
        };
        obj.method();

        Functional.MyFunctionalInterface obj2 = () ->
            System.out.println("This is printing from the lambda");
        obj2.method();

        Functional.AnotherFunctInter obj3 = (num) -> num/2;
        System.out.println(obj3.half(45));

        Functional.TwoParameters obj4 = (num1, num2) -> num1 - num2;
        System.out.println(obj4.difference(2, 5));


    }

}
