package BTVN;
import java.util.Scanner;

/* 
This code is program to find greatest common divisor and least common multiple of 3 numbers
*/
public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    /// function to find greatest common divisor of 2 numbers
    static int gcd(int a , int b){
        if(b == 0)  return a;
        
        return gcd(b , a % b);
    }
    /// function to find least common multiple of 2 numbers
    static int lcm(int a, int b, int c) {
        int _lcm = (a * b) / gcd(a, b);
        return (_lcm * c) / gcd(_lcm, c);
    }
    
    public static void main(String[] args) {
        int a , b , c;
        /// Get input
        System.out.print("Enter number a : "); 
        a = sc.nextInt();
        System.out.print("Enter number b : "); 
        b = sc.nextInt();
        System.out.print("Enter number c : "); 
        c = sc.nextInt();

        /// Solve
    
        int _gcd , _lcm;
        _gcd = gcd(gcd(a , b) , c);
        _lcm = lcm(a , b , c);
        
        System.out.println("LCM : " + _lcm);
        System.out.println("GCD : " + _gcd);
        
       }
}
