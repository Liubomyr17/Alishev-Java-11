package com.company;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        int number = 10; // primitive type of value
//        char character = 'a'; // primitive type of value
//        String s = "Hello";
//        String s1 = new String("Hello");
        ///////////////////////////////////////
//        int number = 10; // primitive type of value // [10]
//        int[] numbers = new int[5]; //                 numbers -> [array] linked type of value
        //////////////////////////////////////
        int number = 10;
        int[] numbers = new int[5];
        // numbers[0] = 10;
        // numbers[1] = 20;
        for (int i=0; i<numbers.length;i++) {
            numbers[i] = i*10;
        }
        for (int i=0; i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("**************");

        int[] numbers1 = {1,2,3};
        for(int i=0; i<numbers1.length;i++) {
            System.out.println(numbers1[i]);
        }
    }
}
