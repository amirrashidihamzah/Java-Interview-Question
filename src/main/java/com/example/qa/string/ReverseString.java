package com.example.qa.string;

//Question
//Write a Java program to reverse a string without using built-in reverse functions.
public class ReverseString {

    public static void main(String[] args) {

        String str = "automation";
        String reverse=" ";

        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reverse is: " + reverse);
    }
}

//Explanation
//We iterate from the last character to the first and build a new string.