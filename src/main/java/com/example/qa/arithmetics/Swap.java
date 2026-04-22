package com.example.qa.arithmetics;

//Questions
//Swap Two Numbers (Without Temp Variable)

public class Swap {

    static int a=5;
    static int b=10;

    public static void main(String[] args){
        swap(a,b);
    }

    public static void swap(int a, int b){

        System.out.println("before swap " + "a=" + a + " b=" + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("after swap " + "a=" + a + " b=" + b);
    }

}
