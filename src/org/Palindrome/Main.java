package org.Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Program sprawdza czy słowo jest palindromem.");
        System.out.println("Autor: Mateusz Smiech.");
        System.out.println("Wersja: 1.0");
        System.out.println(" ");

        System.out.print("Podaj wyraz: ");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();

        Palin word = new Palin();
        word.isPalindrome(data);
    }
}
