package com.learn;

public class countdigit {

    public static int count(int s) {
        return ((int) (Math.log10(s) + 1));

    }
    // public static void main(String[] args) {

    // Scanner s = new Scanner(System.in);
    // System.out.println("Give me the number:");
    // int n =s.nextInt();
    // int i =0;
    // for(;n>0;i++)n/=10;
    // System.out.println(i);
    // s.close();

    // }
}