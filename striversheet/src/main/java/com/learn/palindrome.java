package com.learn;

public class palindrome {
    public static String isPal(int n) {

        if (revNum.revNumq(n) == n) {
            return "Is a palindrome";
        } else
            return "Is not a palindrome";
    }



    
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        int len = (int) (Math.log10(x)+1);
        int n=x;
        int r=0;
        for(int i =1; i<=len/2;i++){
        r=r*10+n%10;
        n/=10;
        }
        System.out.println("len: "+len+" r:"+r+" n:"+n);
        if((len%2==0 && r==n)||(len%2!=0 && r==(int)(n/10))){return true;}
        return false;
    }

}
