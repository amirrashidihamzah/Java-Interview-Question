package com.example.qa.arrays;

//Question
//check if a given number exists in an array.

public class CheckNumbers {

    public static void main(String[] args){

        int[] arr = {5, 2, 9, 1, 7};
        int target = 9;
        boolean found=false;

        for(int num:arr){
            if(num==target){
                found=true;
            }
        }
        System.out.println("Found " + found);
    }
}

//Logic
//Loop through array, Stop early when found (optimization)
