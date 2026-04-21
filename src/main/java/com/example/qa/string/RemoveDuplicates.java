package com.example.qa.string;
import java.util.LinkedHashSet;

//Question
//Remove duplicate characters from a string.

public class RemoveDuplicates {

    public static void main(String[] args){

        String str = "automation";
        LinkedHashSet<Character>set = new LinkedHashSet<>();

        for(char c:str.toCharArray()){
            set.add(c);
        }

        StringBuilder result = new StringBuilder();

        for(char c:set){
            result.append(c);
        }

        System.out.println(result);
    }
}

//Explanation
//LinkedHashSet maintains insertion order and removes duplicates.