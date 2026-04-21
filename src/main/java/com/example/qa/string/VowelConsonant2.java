package com.example.qa.string;

public class VowelConsonant2 {

    public static void main(String[] args){

        String str= "automation";
        int vowels=0, consonants=0;
        str=str.toLowerCase();

        for(char c:str.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels count is " + vowels);
        System.out.println("Consonant count is " + consonants);
    }
}
