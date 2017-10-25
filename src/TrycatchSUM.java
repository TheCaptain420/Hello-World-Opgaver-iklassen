
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class TrycatchSUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("images/reee.jpg");
        System.out.println("Does it exist: " +file.exists());


        int num1 = 5;
        int num3 = 5;
        int acsum = num1 + num3;
        int sum = 0;
        while (sum != acsum) {
            try {
                System.out.println("What is the sum of " + num1 + " + " + num3);
                sum = input.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("Fejl, du skal indtaste en int.");
                break;
            }

            if (sum == acsum) {
                System.out.println("True");
            } else {
                System.out.println("false");
            }
        }
    }


}
