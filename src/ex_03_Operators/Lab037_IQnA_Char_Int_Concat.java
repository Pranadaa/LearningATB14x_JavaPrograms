package ex_03_Operators;

public class Lab037_IQnA_Char_Int_Concat {
    public static void main(String[] args) {
        char a1 = 'A'; //  ASCII -> 65
        char a2 = 'B'; //  ASCII -> 66
        System.out.println(a1+a2); // AB or 65+66 //o/p == 131
        // char are noting but int :D

        System.out.println('A' == 65);

        short s = 10;
        char c = 'A'; // ASCII -> 65
        System.out.println(s+c);
    }
}
