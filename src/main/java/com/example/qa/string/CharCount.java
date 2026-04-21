package com.example.qa.string;

//Question
//Count how many times a character appears.

public class CharCount {

    public static void main(String[] args){

        String str="automation";
        char target='a';
        int count=0;

        for(char c:str.toCharArray()){
            if(c==target){
                count++;
            }
        }
        System.out.println(count);
    }
}

//Explanation
// Simple loop comparison.