package com.example.qa.string;

public class ReverseSentence {

    public static void main(String[] args){

        String str = "automation testing with selenium framework";
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            result.append(words[i]).append(" ");
        }
        System.out.println("Reversed sentence is: " + result.toString().trim());

    }
}
