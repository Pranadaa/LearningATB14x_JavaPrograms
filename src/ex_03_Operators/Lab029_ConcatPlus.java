package ex_03_Operators;

public class Lab029_ConcatPlus {
    public static void main(String[] args){
        //  + ->
        int a = 10;
        int b = 20;
        System.out.println(a+b);  //30

        // + -> String -> Concatenation
        String first_name = "Learning";
        String last_name = "Java";
        System.out.println(first_name+last_name);
//        System.out.println(first_name-last_name); >>  Invalid
//        System.out.println(first_name*last_name); >> Invalid
//        System.out.println(first_name/last_name); >> Invalid

        // + is used as an overloaded operator in Java because it performs both numeric addition and string concatenation,
        // depending on operand types.
    }
}
