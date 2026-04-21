package com.example.qa.string;

//Question
//Check whether a string is a palindrome.

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev +=str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not A Palindrome");
        }
    }
}

//Explanation - A palindrome reads the same forward and backward.