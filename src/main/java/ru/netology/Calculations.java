package ru.netology;

public class Calculations {
    public static int findLargestPrimeNumberPalindrome(int start, int finish) {
        int largestPrimeNumberPalindrome = 0;

        // Т.к. простые числа не могут быть отрицательными - отсеем этот диапазон и
        // будем искать с первого простого числа по счёту (2), при условии, что оно попадает заданный диапазон
        if (finish < 2) {
            return largestPrimeNumberPalindrome;
        } else if (start < 0) {
            start = 2;
        }

        for (int i = start; i <= finish; i++) {
            if (isPrimeNumber(i)) {
                if (isPalindrome(i)) {
                    largestPrimeNumberPalindrome = i;
                }
            }
        }

        return largestPrimeNumberPalindrome;
    }

    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        int numberLength = numberString.length();
        int hitCounter = numberLength / 2;

        for (int i = 0; i < numberLength; i++, numberLength--) {
            if (numberString.charAt(i) == numberString.charAt(numberLength - 1)) {
                hitCounter--;
                if (hitCounter <= 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String printResult(int result) {

        if (result == 0) {
            return "В заданном диапазоне не найдено простого числа-палиндрома =(";
        }

        return "В заданном диапазоне наибольшее простое число-палиндром: " + result;
    }
}
