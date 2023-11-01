package BTVN;

import java.util.Scanner;
/*
This code is program to searches for the highest number of occurrences in the array, in case there are multiple occurrences.
*/
public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array : " );
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int []cnt = new int[1000006];
        
        for (var x : arr) {
            cnt[x]++;
        }
        
        int mostAppearNumber = Integer.MAX_VALUE;
        int maxCnt = 0;
        
        for (int i = 0; i < n; i++) {
            if(cnt[i] > maxCnt || (cnt[i] == maxCnt && i < mostAppearNumber)){
                mostAppearNumber = i;
                maxCnt = cnt[i];
            }
        }
        System.out.println(mostAppearNumber  + " " + maxCnt);
    }
}
