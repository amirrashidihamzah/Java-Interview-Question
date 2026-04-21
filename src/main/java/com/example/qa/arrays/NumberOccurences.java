package com.example.qa.arrays;

//Question
//Write a program to count how many times a number appears in an array.

public class NumberOccurences {

    public static void main(String[] args){

        int[] arr = {1, 2, 2, 3, 2, 4};
        int target = 2;

        int count=0;

        for(int num:arr){
            if(num==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
