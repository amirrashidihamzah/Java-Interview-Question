package com.example.qa.string;

//Question
//Check whether a string contains only numbers.

public class NumericCheck {

    public static void main(String[] args) {
        String str = "123456";

        boolean isNumeric = str.matches("[0-9]+");

        System.out.println("Is numeric: " + isNumeric);
    }
}
