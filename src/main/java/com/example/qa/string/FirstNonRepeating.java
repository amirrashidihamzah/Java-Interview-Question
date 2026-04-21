package com.example.qa.string;
import java.util.LinkedHashMap;
import java.util.Map;

//Question
//Find the first non-repeating character.

public class FirstNonRepeating {

    public static void main(String[] args){

        String str = "automation";

        Map<Character,Integer>map= new LinkedHashMap<>();

        for(char c:str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non-repeating: " + entry.getKey());
                break;
            }
        }
    }
}

//Explanation
//We use a map to count occurrences while preserving order.