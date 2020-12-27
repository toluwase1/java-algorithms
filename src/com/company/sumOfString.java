package com.company;

public class sumOfString {
    //first convert string to integer

    public static void main (String[] args){
        String s1 = "111";
        String s2 ="222";
        //converts string to integer
        int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
        System.out.println(sum);
        //converts integer to string
        System.out.println(String.valueOf(sum));
    }

}
