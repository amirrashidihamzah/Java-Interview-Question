package com.example.qa.string;

//Question
//Count vowels and consonants in a string.

public class VowelConsonant {

    public static void main(String[] args){

        String str= "automation";
        int vowels=0, consonants=0;

        str=str.toLowerCase();

        for(char c: str.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c)!=-1){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels count is " + vowels);
        System.out.println("Consonants count is "+ consonants);
    }
}

//Explanation
//We check each character and classify it.