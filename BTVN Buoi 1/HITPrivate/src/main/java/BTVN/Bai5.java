package BTVN;

import java.util.*;

/*
This code is program to find 2 number maximum in an array has 5 integer numbers
 */
public class Bai5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i, sc.nextInt());
        }

        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.get(1) + " " +  numbers.get(0));

    }

}
