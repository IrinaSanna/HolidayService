package ru.netology.javaqa.HolidayService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calculate.csv")
    public void firstCalculation(int expected, int income, int expenses, int threshold) {
        HolidayService service = new HolidayService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
