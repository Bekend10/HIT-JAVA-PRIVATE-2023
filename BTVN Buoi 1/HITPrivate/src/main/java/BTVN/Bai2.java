package BTVN;
import java.util.*;
/*
This code is program to converts a natural number in base 10 to a number in any base b
*/
public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    
    // Function to convert numbers from base 10 to base b
    public static String Solve(int num, int base) {
        if (num == 0) {
            return "0";
        }
    // Used to represent the numbers 10-15
        String digits = "0123456789ABCDEF"; 

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int r = num % base;
            result.insert(0, digits.charAt(r));
            num /= base;
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.print("Get input : ");
        int decimalNumber = sc.nextInt(); 
        int baseB = sc.nextInt();

        if (baseB < 2 || baseB > 16) {
            System.out.println("Wrong condition ! Please re-enter information .");
        }
        else {
            String result = Solve(decimalNumber, baseB);
            System.out.println("Output : " + result);
        }

    }
    
}
