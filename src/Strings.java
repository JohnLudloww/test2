import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static void main(String[]args)
    {
        String s = " hello ";
        System.out.println(s.length()); // returns 7 because it has a space at start and at the end;
        System.out.println(s.contains("lo")); // will return true
        System.out.println(s.isEmpty()); //returns false
        System.out.println(s.toUpperCase()); // returns all caps HELLO
        System.out.println(s.replace("ll", "11")); //replaces hello with he11o
        System.out.println(s.substring(0,3)); // returns he because its a range from 0 - 3 the white space counts as 1 h is 2 e is 3.
        String s14 = " hello ";
        System.out.println(s == s14); // RETURNS TRUE

        String name1 = "john";
        String name2 = "John";
        System.out.println(name1.equals(name2)); //returns false cause one is capital j while other is lowercase.

        // \t tab
        // \b backspace
        // \n new line
        // \r carriage return
        // \f form feed
        // \' single quote
        // \" double quote
        // \\backslash
        System.out.println("Hello this is a test for\n the next lineeee\n eeeee\n eeee");// This uses 3 different lines because of \n
        System.out.println("this is a unicode character test, \u00A9 hello"); // used for © symbol (copy right)

        //String formatting test
        String greeting = "Hello  dear %s! Good %s";
        String morning = "morning";
        String format = String.format(greeting, name1, morning);
        System.out.println(format);

        String gmailPattern = "[a-zA-Z-\\d] + @gmail\\.com";
        Pattern p = Pattern.compile(gmailPattern);
        String text = "TESTING EMAIIL + TEST + HELLO + BYE";
        Matcher m = p.matcher(text);

        m.find();
       // String gmailAddress = m.group();
        // System.out.println(gmailAddress);

        String sample = "this string. contains 3? sentences!";
        String[] sentences = sample.split("[\\.!?]");
        System.out.println(Arrays.toString(sentences));

        System.out.printf("%.1f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI);
        System.out.printf("%.3f%n", Math.PI);
        System.out.printf("%.4f%n", Math.PI);












    }










}
