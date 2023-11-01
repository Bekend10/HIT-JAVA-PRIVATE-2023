package BTVN;

import java.util.Scanner;

/**
 This code is program to calculate the sum of the elements in the segment from position L to position R in the array.
 */
public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n , q;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int arr[] = new int [n];
        System.out.print("Enter elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int F[] = new int [n];
        
        for (int i = 0; i < n; i++) {
            if(i == 0){
                F[i] = arr[i];
            }
            else{
                F[i] = F[i - 1] + arr[i];
            }
        }
        
        System.out.print("Enter number of queries : ");
        q = sc.nextInt();
        while(q > 0){
            int L , R;
            System.out.print("Enter L :");
            L = sc.nextInt();
            System.out.print("Enter R : ");
            R = sc.nextInt();
            
            L--;
            R--;
            
            if(L == 0){
                System.out.print("Result : " +  F[R]);
            }
            else{
                System.out.println("Result :" + (F[R] - F[L - 1]));
            }
            System.out.println();
            q--;
        }
    }
}
