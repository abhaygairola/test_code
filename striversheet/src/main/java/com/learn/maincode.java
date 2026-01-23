package com.learn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class maincode {

    public static void main(String[] args) {

        // Scanner s = new Scanner(System.in);
        // System.out.println("Give me the number:");
        // int n1 = s.nextInt();
        // System.out.println("palind:"+palindrome.isPalindrome(n1));
        // System.out.println("Give me the name:");
        // String nm = s.next();
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
        // HashMap<Integer,Integer> t= new HashMap<>();
        // rec_num.rec_fac(n1, t);
        // // System.out.println(t.values());
        simplesort<Integer> x = new simplesort<>();
        // processxml x =new processxml();
        // x.doProcessMessage();

        

        Integer y[]={23,432,324,1,1,1,1,2,3,4,5,6,4343,32427,8,9,24,342,32,234,1,2,3,4,5,6,42342};
        x.Bubble_sort(y);
        List<Integer> a = Arrays.asList(y);
        System.out.println("bubb:"+a);


        Integer y1[]={23,432,324,1,1,1,1,2,3,4,5,6,4343,32427,8,9,24,342,32,234,1,2,3,4,5,6,42342};
        x.selection_sort(y1);
        a = Arrays.asList(y1);
        System.out.println("sell:"+a);



        // Integer y2[]={23,432,1,2,3,4,5,6,4343,32427,8,9,24,342,32,234,1,2,3,4,5,6};
        // x.instertion_sort(y2);
        // a = Arrays.asList(y2);
        // System.out.println("inss:"+a);3242


                int y3[]={23,432,1,2,3,4,5,6,4343,32427,8,9,24,342,32,234,1,2,3,4,5,6};
        compx_sort.merge_srt(y3, 0, y3.length-1);
        a = Arrays.asList(y2);
        System.out.println("merg:"+a);




        // // s.close();

        // // 
        // // System.out.println(Arrays.toString((rec_num.rec_rev(x, x.length))));
        // System.out.println("Palindrome : "+rec_num.rec_palind(nm,nm.length()));

    }

//     public static void test2() {

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(21);
//         System.out.println(al.toString());
//         al.add(3);
//         System.out.println(al.toString());
//         al.add(765);
//         System.out.println(al.toString());
//         al.add(1);
//         System.out.println(al.toString());
//         al.add(87);
//         System.out.println(al.toString());
//         al.add(87);
//         System.out.println(al.toString());
//         System.out.println(al.toString());
//         al.remove((Integer) 1);
//         System.out.println(al.toString());
//         ArrayList<Integer> al2 = new ArrayList<>();
//         al2.addAll(al);
//         al2.remove((Integer) 87);
//         System.out.println(al2.contains(87));
//         al2.remove((Integer) 87);
//         System.out.println(al2.contains(87));
//         System.out.println(al2);
//         al.removeAll(al2);
//         System.out.println(al);
//         // System.out.println(al.size());
//         // System.out.println(al2.size());
//         Iterator i = al2.iterator();
//         while(i.hasNext()){
//                 System.out.println(i.next());
//         }
//         System.out.println("--------------");
//         for(Integer ii:al) {System.out.println(ii);}
//         Collections.sort(al2);
//         System.out.println(al2);

//     }

//     public static void  test3 (){
//         // LinkedList<String> ll = new LinkedList<>();

//         PriorityQueue<String> ll = new PriorityQueue<>();
//         ll.add("adfsa"); System.out.println(ll);
//         ll.add("dsafds");System.out.println(ll);
//         ll.add("gfhsfdsg");System.out.println(ll);
//         ll.add("ajfdsdfsj");System.out.println(ll);
//         ll.add("eadsfr");System.out.println(ll);
//         ll.add("bfsdsfd");System.out.println(ll);
//         // ll.push("new");System.out.println(ll);
//         // ll.push("new2");System.out.println(ll);
//         // ll.push("new32");System.out.println(ll);
//         // ll.push("new43");System.out.println(ll);
//         // ll.pop();System.out.println(ll);

//         }



//         public static void  test4 (){

//            Set<String> setq=new TreeSet<>();    
//            setq.add("One");System.out.println(setq);
//            setq.add("Two");   System.out.println(setq);   
//            setq.add("Two");setq.add("Two");setq.add("Two");setq.add("Two");  
//            setq.add("Three");   System.out.println(setq);  
//            setq.add("Four");    System.out.println(setq);
//            setq.add("Five");    System.out.println(setq);
//         }
        
        
//         public static <T> void  test5 (){


//             TreeMap<Integer,String> hp = new TreeMap<>(new Comparator<Integer>() {
//                 @Override
//                 public int compare(Integer a, Integer b){if(a>b)return -1;else return 1;}
//             });
//             // TreeMap<Integer,String> hp = new TreeMap<>();
//             hp.put(1,"dasf");
//             hp.put(5,"dsaf");
//             hp.put(9,"gf");
//             hp.put(4,"fds");
//             hp.put(23,"a");
//             System.out.println(hp);
//         }


}
