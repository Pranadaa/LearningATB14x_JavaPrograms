package ex_03_Operators;

public class Lab030_IQnA_Concatenation {
    public static void main(String[] args) {
        String first_name = "Java";
        String last_name = "Learning";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // JavaLearning1010
        System.out.println(a + b + first_name + last_name); //20JavaLearning
        System.out.println(first_name+ a + b + last_name);  //Java1010Learning
        System.out.println(first_name+ (a + b) + last_name);//Java20Learning
        // BODMAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b));// JavaLearning20

    }

//    Java evaluates + expressions from left to right.
//    When a String appears on the left, all following + operations become string concatenation.
//    When both operands are numbers, Java performs numeric addition.
//    Parentheses () have highest priority, so (a + b) is computed before concatenation.
//    Therefore, the output changes based on the order of operands and where Strings appear in the expression.
}
