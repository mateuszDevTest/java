package org.TriangleValid;

class Validator {
    void valid(int a, int b, int c) {
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Trójkąt o bokach "+ a +", "+ b +", "+ c +", może zostać utworzony.");
        }
        else {
            System.out.println("Trójkąt o bokach "+ a +", "+ b +", "+ c +", nie może zostać utworzony.");
        }

    }
}
