package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] Array = Exercise.Calculate(7);
        for (int item: Array) {
            System.out.print(item + " ");
        }   
    }
}
