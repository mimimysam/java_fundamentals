package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // write your code below
        int x = 236;
        int y = 275;

        if (x < y){
            System.out.println("x is less than y");
        }
        if (x <= y){
            System.out.println("x is less than or equal to y");
        }

        int c = 908;
        int d = 394;

        if (c > d){
            System.out.println("c is greater than d");
        }
        if (c >= d){
            System.out.println("c is greater than or equal to d");
        }

        int e = 57;
        int f = 57;

        if (e == f){
            System.out.println("e is equal to f");
        }

    }

}

