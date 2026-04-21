package com.example.qa.arrays;

//Question
//find duplicate elements in an array.

import java.util.HashSet;

public class DuplicateElement3 {

    public static void main(String[] args){

        int[] arr = {1, 2, 2, 3, 4, 4};
        HashSet<Integer> seen = new HashSet<>();

        for(int num:arr){
            if(!seen.add(num)){
                System.out.println("Duplicate " + num);
            }
        }
    }
}
