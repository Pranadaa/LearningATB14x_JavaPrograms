package ex_02_Literals;

public class Lab022_CharLiterals {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; // "" == String => Bunch of Char


        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("JavaLearning");
        System.out.println("Java"+new_line+"Learning");
        System.out.println("Java\nLearning");
        System.out.println("Java"+tab_line+"Learning");
        System.out.println("Java"+back_space+"Learning");
        System.out.println( " ----- ");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line with space");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char rupees = '₹';
        System.out.println(rupees);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        String emoji = "\uD83D\uDE04"; // 😄
        System.out.println(emoji);

        char c11  = '\u1F60';

        char letterA = '\u0041';
        char euro = '\u20AC';
        String emoji2 = "\uD83D\uDE0A";  // 😊

        System.out.println("Letter A: " + letterA);
        System.out.println("Euro sign: " + euro);
        System.out.println("Emoji: " + emoji2);
    }
}

//What is Unicode?
//Unicode is a universal standard for representing text and symbols from all languages and writing systems in the world — using numbers.

//Think of it like this:
//Every character (like A, あ, अ, 😊, €, etc.) is assigned a unique code number.
//That number is called a Unicode code point. The unique number assigned to each character (e.g. U+1F60A = 😊)
//These numbers let computers store, transmit, and display text reliably across all platforms and languages.
//Java Escape: '\\uXXXX' format to insert Unicode characters in code  (only one back slash is req but Java parses unicode before everything and xxxx is invalid
//so it throws 'Illegal unicode escape' error
//Surrogate Pair- A way to represent characters above U+FFFF using two chars in Java- mostly used for emojis as Emojis are outside the basic range (U+0000 to U+FFFF),
//so Java needs surrogate pairs or special handling.