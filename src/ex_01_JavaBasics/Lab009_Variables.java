package ex_01_JavaBasics;

public class Lab009_Variables {
    public static void main(String[] args) {
        /* data_type variable_name or identifier = variable_value or literal */

        int num = 5;               // Integer (whole number)
        float Float = 5.99f;       // Floating point number
        char C = 'D';              // Character
        boolean B = true;          // Boolean
        String S = "Hello";        // String
        double D= 14.55;           //double
        long L= 120000067l;        //long and float data type literals ends with l and f then only it will treat as long and float variable
/*
        byte age_sunil = 45;
        byte -> data type - type of container
        age_sunil ->  variable_name |  identifier
                = -> Assignment Operator ?  (after some time)
        65 -> Variable Value |  Literal
*/
        System.out.println("Integer: " + num);
        System.out.println("Float: " + Float);
        System.out.println("Character: " + C);
        System.out.println("Boolean: " + B);
        System.out.println("String: " + S);
        System.out.println("String: " + D);
        System.out.println("String: " + L);
    }
}
