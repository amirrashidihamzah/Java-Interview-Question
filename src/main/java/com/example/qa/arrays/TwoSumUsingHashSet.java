package com.example.qa.arrays;

import java.util.HashSet;

public class TwoSumUsingHashSet {

    public static void main(String[] args){

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashSet<Integer>set=new HashSet<>();

        for(int num:arr){
            int needed = target-num;
            if(set.contains(needed)){
                System.out.println(num + " + " + needed);
                break;
            }
            set.add(num);
        }
    }
}
