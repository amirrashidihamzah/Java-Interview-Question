package com.example.qa.arithmetics;

//Problem: Reverse digits of a number (e.g., 123 → 321, -456 → -654) Aku Kena fahamkan

public class ReverseNumber {

    public static int reverse(int num){
        int reversed = 0;
        while (num!=0){
            int digit = num%10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(456));  // 321
    }
}
