package com.learn;

import java.util.HashMap;

public class rec_num {

    public static void rec_name(int i, String name) {
        if (i == 0)
            return;
        System.out.print(name + " ");
        rec_name(i - 1, name);
    }

    public static void rec_count(int i) {
        if (i == 0)
            return;
        rec_count(i - 1);
        System.out.print(i + " ");
    }

    public static void rec_count_comma(int i, int cnt) {
        if (cnt > i)
            return;
        else if (cnt == i)
            System.out.print(cnt);
        else
            System.out.print(cnt + ",");
        rec_count_comma(i, cnt + 1);

    }

    public static void rec_rev_count_comma(int i, int cnt) {
        if (cnt > i)
            return;
        else if (cnt == 1) {
            rec_rev_count_comma(i, cnt + 1);
            System.out.print(cnt);
        } else {
            rec_rev_count_comma(i, cnt + 1);
            System.out.print(cnt + ",");
        }

    }

    public static int rec_sum(int i) {
        if (i == 0)
            return 0;
        return i + rec_sum(i - 1);

    }

    public static int rec_fac(int n, HashMap<Integer, Integer> s) {
        if (n == 0) {
            s.put(0, 0);
            return 0;
        }
        if (n == 1) {
            s.put(1, 1);
            return 1;
        }
        int x = rec_fac(n - 1, s) + rec_fac(n - 2, s);
        s.put(n, x);
        return x;

    }
    public static int[] rec_rev(int [] x, int n){
        int ar_last = x.length -1;
        int to = n-1;
        int from= ar_last-to;

        int temp = x[to];
        x[to]=x[from];
        x[from]=temp;
        if(n>x.length/2){
            x=rec_rev(x, n-1);
        }

        return x;

    }

    public static String rec_palind(String s, int n) {
        int len = s.length();
        int to = n - 1;
        int from = len - n;
        if (to > from) {
            if (s.charAt(to) == s.charAt(from)) {
                return rec_palind(s, n - 1);
            } else
                return "NO";
        } else
            return "YES";
    }
}
