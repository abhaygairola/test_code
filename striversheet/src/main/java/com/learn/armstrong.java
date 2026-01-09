package com.learn;

public class armstrong {

    public static String isArmstrng(int n) {
        int cnt = countdigit.count(n);
        int total = 0;
        int num = n;

        for (int i = 0; i < cnt; i++) {
            total += Math.pow(num % 10, cnt);
            num /= 10;
        }
        if (total == n)
            return "Yes";

        return "No";

    }

}
