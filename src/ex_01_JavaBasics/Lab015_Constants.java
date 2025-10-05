package ex_01_JavaBasics;

public class Lab015_Constants {
    public static void main(String[] args) {
        int a = 10;
        a = 12;
        System.out.println(a);

        final int b = 99;
        //b = 100; // Compilation error: cannot assign a value to final variable b

        final float PI = 3.14f;
        final int a1 = 10;
       /* -A constant is a special variable whose value cannot be modified once assigned.
          -After creation and initialization, its value remains fixed throughout the program.
          -Example: PI = 3.14 → this value should never change during execution.
          -In Java, constants are created using the final keyword.*/
    }
}
