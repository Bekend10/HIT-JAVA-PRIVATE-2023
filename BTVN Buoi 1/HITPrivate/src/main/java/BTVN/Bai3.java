package BTVN;
import java.util.Scanner;
/*
This code is program to calculate the product of the digits of any integer.
 */
public class Bai3 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        System.out.print("Enter number : ");
        n = sc.nextInt();
        
        int multiple = 1;
        while(n > 0){
            multiple *= n % 10;
            n /= 10;
        }
        
        System.out.println("Output : " + multiple);
    }
    
}
