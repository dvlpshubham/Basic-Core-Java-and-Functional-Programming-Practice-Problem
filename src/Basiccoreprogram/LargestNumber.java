package Basiccoreprogram;

import java.util.Scanner;

public class LargestNumber {
    public static void largest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second number ");
        int num2 = sc.nextInt();

        System.out.println("Enter the Third number ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number is : " + num1);
        } else if (num2 > num3) {
            System.out.println("Largest number is : " + num2);
        } else
            System.out.println("Largest number is : " + num3);
        sc.close();
    }

    public static void main(String[] args) {
        largest();

    }

}