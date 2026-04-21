package com.example.qa.arrays;

//Question
//Find the smallest element

public class SmallestElement {

    public static void main(String[] args){

        int[] arr = {5, 2, 9, 1, 7};
        int min=arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
