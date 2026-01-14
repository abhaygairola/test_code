package com.learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class maincode {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // System.out.println("Give me the number:");
        // int n1 = s.nextInt();
        System.out.println("Give me the name:");
        String nm = s.next();
        // // rec_num.rec_name(n1, nm);
        // // // rec_num.rec_rev_count_comma(n1,1);
        // // System.out.println("sum using rec:"+rec_num.rec_sum(n1));
        // // System.out.println("sum using form:"+sum_n.get_sum_n(n1));
        // // System.out.println("Give me another number:");
        // // int n2 = s.nextInt();
        // // System.out.println("Length:" + countdigit.count(n));
        // // System.out.println("Reverse:" + revNum.revNumq(n));
        // // // System.out.println("Palindrome:" + palindrome.isPal(n));
        // // System.out.println("GCD:"+GCD.giveGCD(n1, n2));
        // // System.out.println(armstrong.isArmstrng(n1));
        // // System.out.println(divs.prntdiv(n1));
        // // System.out.println(prime.isPrime(n1));
        // // System.out.println(divs.prntdiv(n1));
        // HashMap<Integer,Integer> t=  new HashMap<>();
        // rec_num.rec_fac(n1, t);
        // System.out.println(t.values());

        // s.close();

        // int x[]={23432,1,2,3,4,5,6,7,8,9,24,342,32,234};
        // System.out.println(Arrays.toString((rec_num.rec_rev(x, x.length))));
        System.out.println("Palindrome : "+rec_num.rec_palind(nm,nm.length()));

    }
}
