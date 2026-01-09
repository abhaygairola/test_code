package com.learn;

public class rec_num {

    public static void rec_name(int i , String name){
    if(i==0)return;
    System.out.print(name+" ");
    rec_name(i-1, name);
    }

    public static void rec_count(int i){
        if (i==0) return;
        rec_count(i-1);
        System.out.print(i+ " ");
    }

       public static void rec_count_comma(int i,int cnt){
        if (cnt>i) return;
        else if (cnt ==i)System.out.print(cnt);
        else System.out.print(cnt+",");
        rec_count_comma(i,cnt+1);
        
    } 
           public static void rec_rev_count_comma(int i,int cnt){
        if (cnt>i) return;
        else if (cnt ==1){rec_rev_count_comma(i,cnt+1);System.out.print(cnt);}
        else {rec_rev_count_comma(i,cnt+1);System.out.print(cnt+",");}        
        
    } 

            public static int rec_sum(int i){
                if(i ==0)return 0;
                return i+rec_sum(i-1);
            
        }
}
