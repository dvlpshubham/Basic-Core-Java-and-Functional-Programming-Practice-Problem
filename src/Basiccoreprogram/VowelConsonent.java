package Basiccoreprogram;

import java.util.Scanner;

public class VowelConsonent {
    public static void checkVowel() {
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
        sc.close();
    }

    public static void main(String[] args) {
        checkVowel();

    }

}