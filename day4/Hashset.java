package com.day4;

import java.util.Arrays;
import java.util.HashSet;

public class Hashset{
    public static void main(String[] args) {


        HashSet<Integer> set = new HashSet<>(Arrays.asList(10,20,30,40,50,60,70));
      
        for (int num : set) {
            set.add(num);
        }

        int target = 10;

        if (set.contains(target)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}