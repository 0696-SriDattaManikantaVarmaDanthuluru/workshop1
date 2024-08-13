package missingvalue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the values in the array for index: " + i);
           arr[i] = sc.nextInt();
        }
        int out = Missing.missingNumber(arr);
        System.out.println("the missing value is: " + Math.abs(out));
    }
}