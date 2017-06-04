package org.Triangle;

import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        System.out.println("Program oblicza pole trójkąta.");
        System.out.println("Autor: Mateusz Smiech.");
        System.out.println("Wersja: 1.0");
        System.out.println(" ");

        System.out.print("Podaj długość podstawy trójkąta: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Podaj wysokość trójkąta: ");
        int h = input.nextInt();

        System.out.println("Długość podstawy: " +  a);
        System.out.println("Wysokość trójkąta: " + h);

        Triangle area = new Triangle();

        area.field( a, h);
    }
}
