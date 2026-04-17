package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int[] testScores = {
                50,47,89,97,100,72,34,66,91,84
        };

        int sum = 0;
        Arrays.sort(testScores);
        for(int score : testScores){
            sum += score;
        }
        int average = sum / (testScores.length);
        System.out.println("The average test score: " + average);
        System.out.println("The highscore is: " + testScores[9]);
        System.out.println("The lowest score is: "+ testScores[0]);

    }
}
