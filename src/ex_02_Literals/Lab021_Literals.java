package ex_02_Literals;

public class Lab021_Literals {
    public static void main(String[] args) {
        int age = 65;
        // 65 is an integer literal assigned to variable age

        final float pi = 3.14f;
        //  3.14f is a float literal.
        // pi is marked as final, so its value cannot be changed once assigned

        final int girl_age = 18; //18 is an integer literal
        //girl_age = 19; //girl_age is declared as final, so if you try girl_age = 19; you’ll get a compile-time error

        float pi0 = 3.14f;
        float pi2 = 3.14F;
        float x = 10.00f;

        boolean is_married = true;
        boolean is_married_amit = false;
        // boolean is_married_amit = 123; //boolean variables cannot take numeric values like 0, 1, or 123.
        // They can only be true or false

        int age1 = 65; // 65 is a decimal literal - base 10 (digits 0–9)

        // Binary Literal
        int binary_num = 0b1010; // Binary System


        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745

    }
}
