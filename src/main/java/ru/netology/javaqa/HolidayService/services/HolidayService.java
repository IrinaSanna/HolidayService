package ru.netology.javaqa.HolidayService.services;

public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // порог для отдыха
                count++;
                money = (money - expenses) / 3; // можно отдахнуть
            } else {
                money = money + income - expenses; // надо работать
            }
        }
        return count;
    }
}
