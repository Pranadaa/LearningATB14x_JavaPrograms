package ex_03_Operators;

public class Lab027_RelationalOperators {
    public static void main(String[] args){
        // <    Less Than
        // <=   Less than or equal to
        // >    Greater
        // >=   Greater or equal
        // ==   Equal to (but checking)
        // !=   Not equal

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);  //false

        int age_priyanka = 28;
        int age_akshay = 29;

        boolean result = age_akshay >= age_priyanka;
        System.out.println(result);     //true

        System.out.println(10 == 10);  //true
        System.out.println(10 == 11);  //false
        //== it will return boolean if the statement is true then true will be printed else false
    }
}
