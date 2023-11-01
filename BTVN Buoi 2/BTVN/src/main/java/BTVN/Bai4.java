package BTVN;

import java.util.Scanner;

/**
This code is program to check whether the input string is a pangram string or not 
 */
public class Bai4 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String s;
        System.out.print("Enter your string : ");
        s = sc.nextLine().toLowerCase();
        int n = s.length();
        
        int cnt[] = new int ['z' + 1];
        
        
        for (int i = 0; i < n; i++) {
            cnt[s.charAt(i)]++;
        }
        
        int ans = 1;
        
        for (int i = 'a'; i <= 'z' ; i++) {
            if(cnt[i] == 0){
                ans = 0;
            }
        }
        if(ans == 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
    
}

