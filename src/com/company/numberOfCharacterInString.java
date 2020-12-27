package com.company;

import java.util.Scanner;

public class numberOfCharacterInString {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int initialLength =  str.length();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the character to find the occurence");
        String str1 = sc1.next();
        str = str.replace(str1, "");
        int finalLength = str.length();
        System.out.println("Total number of occurence of character= "+str1 +" " +(initialLength-finalLength));

}
}

