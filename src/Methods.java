import javax.swing.*;

import static java.lang.Double.sum;

//NEED TO REVIEW Methods can be confusing
public class Methods {

    public static void main(String[] args) {
        int sum = sum(1, 3);
        printToConsole(sum);
        printToConsole(sum(2.1, 3.5));
        printToConsole(sum(2.1, 3.5));
        printToConsole("Some text");
    }
        private static int sum(int i1, int i2){
            int result = i1 + i2;
            return result;
        }

        private static double sum(double d1, double d2)
        {
            return d1+d2;
        }

        private static void printToConsole(String text)
        {
            System.out.println(text);
        }

        private static void printToConsole(int i)
        {
            System.out.println(i);
        }

        private static void printToConsole(double d)
        {
            System.out.println(d);
        }
    }
        /* returns 4
        5.6
        5.6
        Some text
         */




