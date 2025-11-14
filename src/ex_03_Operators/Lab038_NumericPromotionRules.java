package ex_03_Operators;

public class Lab038_NumericPromotionRules {
    public static void main(String[] args) {
        //byte>>short>>char>>int>>long>>float>>double

        //Numeric Promotion Rules (Simple Points)
        //-When different numeric types are used in an expression, Java promotes smaller types to larger types.
        byte a = 5;
        char b = 'A'; // 65
        System.out.println(a + b); // 5 + 65 = 70 (int)

        //-byte, short, and char are always promoted to int during arithmetic operations.
        //If one operand is int, result is int (unless a bigger type appears).
        short s = 10;
        int i = 20;
        System.out.println(s + i); // 30 (int)

        //-If one operand is long, the whole expression becomes long.
        int a1 = 10;
        long b1 = 20L;
        System.out.println(a1 + b1); // 30 (long)

        //-If one operand is float, the entire expression becomes float.
        long a2 = 10L;
        float b2 = 5.5f;
        System.out.println(a2 + b2); // 15.5 (float)

        //-If one operand is double, the entire expression becomes double.
        float a3 = 4.5f;
        double b3 = 2.2;
        System.out.println(a3 + b3); // 6.7 (double)

        //Mixed types are promoted step-by-step to the largest type in the expression.
        byte a4 = 5;
        int b4 = 10;
        double c = 2.5;
        System.out.println(a4 + b4 + c); // 17.5 (double)
        //-After promotion, the operation is performed and the result is of the promoted type.


    }

}
