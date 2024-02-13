package ru.netology.javaqa.HolidayService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayServiceTest {

    @Test
    public void firstCalculation() {
        HolidayService service = new HolidayService();

        int expented = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expented, actual);
    }

    @Test
    public void secondCalculation() {
        HolidayService service = new HolidayService();

        int expented = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expented, actual);
    }


}
