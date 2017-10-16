package org.Grades;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Program zamienia procenty na oceny.");
        System.out.println("Autor: Mateusz Smiech.");
        System.out.println("Wersja: 1.0");
        System.out.println(" ");

        System.out.print("Podaj ocenę w procentach: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        PercSwitch grade = new PercSwitch();
        grade.percentage(a);

    }
}
