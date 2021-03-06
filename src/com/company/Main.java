package com.company;

import java.util.HashSet;

public class Main {

    public static void main (String[] args) {
        // Java program to find the longest substring without repetition
        String str = "abcdab";
        longest(str);
    }



    private static void longest(String str) {
        HashSet<Character> set = new HashSet<>();
        String longestOverall = "";
        String longestTillnow= "";
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if (set.contains(c)) {
                longestTillnow= "";
                set.clear();
            }
            set.add(c);
            longestTillnow+=c;
            if (longestTillnow.length()> longestOverall.length()) {
                longestOverall = longestTillnow;
            }
        }
        System.out.println(longestOverall);
      //  return longestOverall;
    }
}
