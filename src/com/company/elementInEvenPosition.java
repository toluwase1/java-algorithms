package com.company;

public class elementInEvenPosition {
    //print element at the even positiion
    public static void main (String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8};
        for (int i = 2; i<arr.length; i++){
            System.out.println("Index ="+ i);
            System.out.println("Value ="+arr[i]);
        }
    }
}
