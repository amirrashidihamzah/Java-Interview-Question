package com.example.qa.arrays;

//Question
//Find the largest element in an array

public class LargestElement {

    public static void main(String[] args){

        int[] arr = {5, 2, 9, 1, 7};
        int max = arr[0];

        for(int i=1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

//Logic
//Assume first element is max, compare with others, replace when you find bigger