package org.Fibonacci;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Program wyświetlający ciąg Fibonacciego.");
        System.out.println("Autor: Mateusz Smiech.");
        System.out.println("Wersja: 1.0");
        System.out.print("Podaj ile liczb ma zostać wyświetlone :");

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        Loop loop1 = new Loop();

        loop1.loopFibonacci(count);


    }
}