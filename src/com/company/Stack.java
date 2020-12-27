package com.company;

public class Stack {
    int array[] = new int[5];
    int top = 0;

    private boolean push(int x){
        top++;
        array[top]=x;
        System.out.println("ELEMENT PUSHED INTO THE STACK="+ x);
        return true;
    }
    private int pop(){
        int x = array[top--];
        System.out.println("Elemebt popped from stack =" + x);
        return x;
    }

    private int peak(){
        return array [top];
    }
    public static void main (String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.peak();
        System.out.println("Printing the topmost value=" + stack.peak());
    }

}
