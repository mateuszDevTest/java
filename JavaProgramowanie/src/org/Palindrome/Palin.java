package org.Palindrome;


class Palin {

    void isPalindrome(String str) {

        int h = str.length();

        int kk = 2;
        int k = (h - 1);
        for (int i = 0; i < h; i++) {

            if (str.charAt(i) != str.charAt(k)) {
                kk = 1;
            } else {
                kk = 0;
            }
            k--;

        }

        if (kk == 0)
            System.out.println("Jest palindromem");
        if (kk == 1)
            System.out.println("Nie jest palindromem");

    }
}