package ex_01_JavaBasics;

public class Lab017_MultipleVariables {
    public static void main(String[] args) {
        int a = 10, b = 23, c = 90;
        int _ = 10, $ = 34;
     /*   you can initialize multiple variables in a single line, but it’s good practice to keep
        code readable—use one line only for short simple declarations*/

        int x = 5, y = 10; //its valid
        //  int p = 1, double q=2; // invalid (different types)


        // You can also declare without initializing as per below:
        int m, n, o;        // declared only
        m = 1; n = 2; o = 3; // initialized later

        //initializing multiple final constants in a single line
        final int A = 10, B = 20, C = 30;
        final int D, Y = 50; // (D is not initialized)
        // System.out.println(D); //Error java: variable D might not have been initialized
    }
}
