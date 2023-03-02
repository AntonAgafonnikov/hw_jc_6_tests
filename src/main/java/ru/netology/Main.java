package ru.netology;

public class Main {

    public static void main(String[] args) {

        // Найти наибольшее простое число-палиндром в заданном диапазоне
        int result = Calculations.findLargestPrimeNumberPalindrome(-234, 87470);
        String resultMessage = Calculations.printResult(result);
        System.out.println(resultMessage);
        
    }
}