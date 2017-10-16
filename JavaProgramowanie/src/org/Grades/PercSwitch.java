package org.Grades;

class PercSwitch {
    void percentage (int a) {
        if (a < 55) {
            System.out.println("Otrzynana ocena: 1.");
        }
        else if ( 55 <= a && a <65 ){
            System.out.println("Otrzynana ocena: 2.");
        }
        else if (65 <= a && a < 75){
            System.out.println("Otrzynana ocena: 3.");
        }
        else if (75 <=a && a < 85){
            System.out.println("Otrzynana ocena: 4.");
        }
        else if (85 <= a && a < 95){
            System.out.println("Otrzynana ocena: 5.");
        }
        else if (95 <= a && a < 100){
            System.out.println("Otrzynana ocena: 6.");
        }
        else {
            System.out.println("Podana wartość jest nieprawidłowa.");
        }
    }
}
