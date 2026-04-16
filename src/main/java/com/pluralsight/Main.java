package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int[] testScores = {
                50,47,89,97,100,72,34,66,91,84
        };

        Arrays.sort(testScores);
        for(int score : testScores){
            System.out.println(score);
        }
    }
}
