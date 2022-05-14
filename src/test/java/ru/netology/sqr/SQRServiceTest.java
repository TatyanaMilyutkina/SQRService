package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void test (int began, int end, int expected) {
        SQRService squareRoot = new SQRService();
        int actual = squareRoot.sqr(began, end);
        Assertions.assertEquals(expected, actual);
    }



}
