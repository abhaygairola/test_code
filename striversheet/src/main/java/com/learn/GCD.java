package com.learn;

public class GCD {  
    public static int giveGCD(int a, int b) {
        int divd = Math.max(a, b);
        int divs = Math.min(a, b);
        int tempdivs;

        while (divs != 0) {
            tempdivs = divd % divs;
            divd = divs;
            divs = tempdivs;
        }

        return divd;  
    }
}
 