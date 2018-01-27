import java.util.Scanner;

/**
 * Exercises on if, for and while loops
 */
public class Main {

    public static void main(String[] args) {


        //TODO: Write a Java program to compare two numbers.

        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number: ");
        b = input.nextInt();

        if (a > b) {
            System.out.println("The first number is greater than the second one ");
        } else if (a < b) {
            System.out.println("The first number is smaller than the second one ");
        } else if (a == b) {
            System.out.println("The numbers are equal ");
        }


        // TODO: Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
        // TODO: Otherwise, print "positive" or "negative".


        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        double num;
        num = sc.nextDouble();
        if (num == 0) {
            System.out.println("The number is zero ");
        } else if (num > 0) {
            System.out.println("The number is positive ");
        } else if (num < 0) {
            System.out.println("The number is negative ");
        }


        // TODO: Write a program in Java to display the first 10 natural numbers.

            System.out.println("The first 10 natural numbers are: ");
            for (int l = 1; l <= 10; l++) {
                System.out.println(l);
            }



        // TODO: Write a Java program to reverse a string. Print the before and after.

            Scanner er = new Scanner(System.in);
            System.out.println("Input a word:");
            char[] initial = er.nextLine().toCharArray();

            for (int i = initial.length - 1; i >= 0; i--) {
                System.out.print(initial[i]);
            }

        }

}

