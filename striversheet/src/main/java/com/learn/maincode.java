package com.learn;

import java.util.Scanner;

public class maincode {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Give me the number:");
        int n1 = s.nextInt();
        // System.out.println("Give me another number:");
        // int n2 = s.nextInt();
        // System.out.println("Length:" + countdigit.count(n));
        // System.out.println("Reverse:" + revNum.revNumq(n));
        // // System.out.println("Palindrome:" + palindrome.isPal(n));
        // System.out.println("GCD:"+GCD.giveGCD(n1, n2));
        // System.out.println(armstrong.isArmstrng(n1));
        // System.out.println(divs.prntdiv(n1));
        System.out.println(prime.isPrime(n1));
        System.out.println(divs.prntdiv(n1));
        s.close();

    }
}
