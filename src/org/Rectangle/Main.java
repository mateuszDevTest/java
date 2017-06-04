package org.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        System.out.println("Program oblicza pole i obwód prostokąta.");
        System.out.println("Autor: Mateusz Smiech.");
        System.out.println("Wersja: 1.0");
        System.out.println(" ");

        System.out.print("Podaj długość pierwszego boku prostokąta: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Podaj długość drugiego boku prostokąta: ");
        int b = input.nextInt();



        RectangleField area = new RectangleField();
        area.field(a, b);

        RectanglePeri peri = new RectanglePeri();
        peri.perimeter(a, b);
    }
}
