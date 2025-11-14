package ex_03_Operators;

public class Lab035_InstanceOfOperator {
    public static void main(String[] args) {
        String s1 = new String("Pranada");
        System.out.println(s1 instanceof String);   //true

        String name = "Java";

        System.out.println(name instanceof String); // true
    }
}

//The instanceof operator tests object–type compatibility and returns
// true if the object is an instance of the given class, subclass, or interface; otherwise false.

//The instanceof operator in Java is used to check whether an object belongs to a particular class or interface.

//Why it is used?
//-To avoid ClassCastException
//-To check the type of an object before casting
//-Useful in inheritance and polymorphism
