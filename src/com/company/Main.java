package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] fibonacciNumbers = getFibonacciSeries(5);
        System.out.println(Arrays.toString(fibonacciNumbers));
    }

    private static int[] getFibonacciSeries(int number) {
        if (checkIfFirstElems(number))
            return getFirstFibonacciElems(number);
        return generateFibonacciSeries(number);

    }

    private static boolean checkIfFirstElems(int number) {
        return number < 2 ? true : false;
    }

    private static int[] getFirstFibonacciElems(int number) {
        if (number == 0)
            return new int[]{0};
        else
            return new int[]{1};
    }

    private static int[] prepareFibonacciFirstElements(int number) {
        return  new int[]{0,1};
    }

    private static int[] generateFibonacciSeries(int number) {
        int[] baseElements = prepareFibonacciFirstElements(number);
        int[] fibonacciSeries = Arrays.copyOf(baseElements, number);
        for (int i = 2; i < number; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        return fibonacciSeries;
    }
}
