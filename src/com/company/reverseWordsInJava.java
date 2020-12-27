package com.company;

public class reverseWordsInJava {
    //reversing words in Java
    public static void main(String[] args) {
        String str ="Welcome to Java Word";
       String splitArray[] = str.split(" ");
       for (int i=splitArray.length-1; i>=0;i--) {
           System.out.println(splitArray[i]);
       }
    }
}
