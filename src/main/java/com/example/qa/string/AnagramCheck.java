package com.example.qa.string;
import java.util.Arrays;

//Question
//Check whether two strings are anagrams.

public class AnagramCheck {

    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
           System.out.println("Anagram");
        }else{
           System.out.println("Not Anagram");
        }
    }
}

//Explanation
//Anagrams have same characters in different order.