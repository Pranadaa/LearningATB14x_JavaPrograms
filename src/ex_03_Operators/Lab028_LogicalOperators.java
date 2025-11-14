package ex_03_Operators;

public class Lab028_LogicalOperators {
    public static void main(String[] args) {
        //Logical operators are used to combine or invert boolean expressions.
        // && (Logical AND)
        // || (Logical OR)
        // ! (Logical NOT)


        // || OR gate

        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true);  // True
        System.out.println(false || false); // False

        //  And  && gate
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False

        // NOT !
        System.out.println(!true); // False
        System.out.println(!false); // True

        boolean a = true;
        System.out.println(!a); //false

        boolean b = true;
        System.out.println(!!b); //true

        boolean c= true || false;

        System.out.println(c); //true (OR gate)

        boolean c1= false && true;
        System.out.println(c1);  //false (AND gate)
    }
}
