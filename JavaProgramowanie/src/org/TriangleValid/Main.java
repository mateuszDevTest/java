package org.TriangleValid;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Program sprawdza czy można stworzyć trókąt z podanych długości boków.");
        System.out.println("Autor: Mateusz Smiech.");
        System.out.println("Wersja: 1.0");
        System.out.println(" ");

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj długość pierwszego boku: ");
        int a = input.nextInt();
        System.out.print("Podaj długość drugiego boku: ");
        int b = input.nextInt();
        System.out.print("Podaj długość trzeciego boku: ");
        int c = input.nextInt();

        Validator valid = new Validator();
        valid.valid( a, b, c);
    }
}