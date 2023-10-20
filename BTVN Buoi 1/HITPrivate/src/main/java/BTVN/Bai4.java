package BTVN;
/*
This code is program to calculate the sum, difference, product, and quotient of 2 integers.
*/
import java.util.*;

public class Bai4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String a;
        System.out.print("Get input : ");
        a = sc.nextLine().trim();

        String[] parts = a.split(" ");
        if (parts.length != 3) {
            System.out.println("Wrong condition ! ");
            return;
        }

        String num1 = parts[0];
        String operator = parts[1];
        String num2 = parts[2];

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        switch (operator) {
            case "+" ->
                System.out.println(number1 + number2);
            case "-" ->
                System.out.println(number1 - number2);
            case "*" ->
                System.out.println(number1 * number2);
            case "/" -> {
                if (number2 != 0) {
                    System.out.println(number1 / number2);
                } else {
                    System.out.println("Error calculator !");
                }
            }
            default ->
                System.out.println("Error conditon !");
        }

    }
}
