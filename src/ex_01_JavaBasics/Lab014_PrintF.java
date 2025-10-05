package ex_01_JavaBasics;

public class Lab014_PrintF {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
//        System.out.println(a);  >> outputs prints on the next line
//        System.out.println(b);

//        System.out.print(a); >> outputs continue on the same line
//        System.out.print(b);

        System.out.printf("Value of a=%d",a); //This line prints the text "Value of a=" followed by the integer value stored in variable a
        System.out.println();
        System.out.printf("Value of b=%d",b);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
    }
}
