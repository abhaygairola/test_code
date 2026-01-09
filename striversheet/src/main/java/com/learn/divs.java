package com.learn;

import java.util.Set;
import java.util.TreeSet;

public class divs {
    public static Set<Integer> prntdiv(int n)
    {
        Set<Integer> s = new TreeSet<>();
        System.out.println();
        for(int i =1;i<=Math.sqrt(n);i++)
            {
                if(n%i==0){s.add(i);s.add(n/i);}
            }
            return s;
    }
    
}
