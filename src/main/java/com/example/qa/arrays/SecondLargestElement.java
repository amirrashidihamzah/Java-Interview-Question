package com.example.qa.arrays;

//Question
//find the second largest element in an array.

public class SecondLargestElement {

    public static void main(String[] args){

        int[] arr = {5, 2, 9, 1, 7};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num:arr){
            if(num > largest){
                second = largest;
                largest = num;
            }else if(num > second && num!=largest){
                second = num;
            }
        }
        System.out.println("Second Largest is " + second);
    }
}
