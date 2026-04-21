package com.example.qa.string;

//Question
//Find the longest word in a sentence.

public class LongestWord {

    public static void main(String[] args) {

        String str = "automation testing with selenium framework";
        String[] words= str.split(" ");
        String longest=" ";

        for(String word:words){
            if(word.length() > longest.length()){
               longest = word;
            }
        }
        System.out.println("longest is " + longest);
    }
}

//Explanation
//Split string and compare word lengths.