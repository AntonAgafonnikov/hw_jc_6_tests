package ru.netology;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CalculationsTests {

    @ParameterizedTest
    @MethodSource("addTestParametersFLPP")
    public void testFindLargestPrimeNumberPalindrome(int start, int finish, int expected) {
        System.out.println("Параметризованный тест нахождения наибольшего простого числа-палиндрома");

        // act
        int result = Calculations.findLargestPrimeNumberPalindrome(start, finish);
        //assert
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> addTestParametersFLPP() {
        return Stream.of(
                Arguments.of(0, 19, 11),
                Arguments.of(-356, 2, 2),
                Arguments.of(-11, 1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("addTestParametersIsPalindrome")
    public void testIsPalindrome(int number, boolean expected) {
        System.out.println("Параметризованный тест на определение числа-палиндрома");

        // act
        boolean result = Calculations.isPalindrome(number);

        //assert
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> addTestParametersIsPalindrome() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(23532, true),
                Arguments.of(2, true),
                Arguments.of(123322, false)
        );
    }

    @ParameterizedTest
    @MethodSource("addTestParametersIsPrimeNumber")
    public void testIsPrimeNumber(int number, boolean expected) {
        System.out.println("Параметризованный тест на определение простого числа");

        // act
        boolean result = Calculations.isPrimeNumber(number);

        //assert
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> addTestParametersIsPrimeNumber() {
        return Stream.of(
                Arguments.of(29, true),
                Arguments.of(79997, true),
                Arguments.of(2, true),
                Arguments.of(54, false)
        );
    }
}
