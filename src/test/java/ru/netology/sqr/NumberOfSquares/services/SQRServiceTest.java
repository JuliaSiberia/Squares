package ru.netology.sqr.NumberOfSquares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/options.csv")
    public void TestLimit(int l, int u, int expected) {
        SQRService service = new SQRService();


        int actual = service.squaring(l, u);

        Assertions.assertEquals(expected, actual);
    }

}
