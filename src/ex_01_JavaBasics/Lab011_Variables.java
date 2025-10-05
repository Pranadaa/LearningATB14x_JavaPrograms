package ex_01_JavaBasics;

public class Lab011_Variables {
    public static void main(String[] args) {
        //byte age = 128;   //-->>Out of range>> byte range is -128 to 127
        int age = 128;
        System.out.println(age);  // 128
        age = age+1;
        age = 30;
        System.out.println(age);  // 30

        int _ = 65;  // Valid identifier
        int $ = 65;
        int year = 2025;
        int this_is_a_vari_long_name_in_the_class_hello_$_akakak = 89;
    }
}
