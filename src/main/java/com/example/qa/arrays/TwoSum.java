package com.example.qa.arrays;

import java.util.HashMap;

//Question
//Write a Java program to find two numbers in an array whose sum equals a given target.
public class TwoSum {

    public static void main(String[] args){

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i= 0;i< arr.length;i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                System.out.println("Pair Found:" + arr[i] + " + " + complement);
                break;
            }
            map.put(arr[i],i);
        }
    }
}
