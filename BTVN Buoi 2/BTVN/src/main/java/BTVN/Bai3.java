package BTVN;

import java.util.Scanner;

/**
This code is program to count the number of letters, numbers, and special characters in a string
 */
public class Bai3 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String s;
        System.out.print("Enter your string : ");
        s = sc.nextLine();
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                cnt1++;
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                cnt1++;
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                cnt2++;
            }
            else{
                cnt3++;
            }
           
        }
        System.out.print("Result : " + cnt1 + " " + cnt2 + " " +cnt3);
    }
    
}
