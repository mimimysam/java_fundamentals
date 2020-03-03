package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 extends Exception {

    @Override
    public String toString() {
        return "UnderAgeException{ Must be 21 to purchase alcohol }";
    }
}
public class Example {

    String Person;
    String Wine;

    public static void main(String[] args){
        try {
            Person somePerson = new Person(19);
            Wine vino = purchaseWine(somePerson, "white");
        } catch (UnderAgeException exc) {
            System.out.println("Unfortunately you must be 21 to purchase alcohol");
        }
    }

    public static Wine purchaseWine(Person person, String style) throws UnderAgeException {
        if (person.age >= 21) {
            return new Wine(style);
        } else {
            // manually throw new custom exception
            throw new UnderAgeException("underage");
        }
    }
}