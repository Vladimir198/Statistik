package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldCalculateSumma() {
        StatsService service = new StatsService();

        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.calculateSum(proceeds);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();

        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.monthlyAverage(proceeds);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateSales() {
        StatsService service = new StatsService();

        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        // вызываем целевой метод:
        long actual = service.maximumSales(proceeds);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateminimumSales() {
        StatsService service = new StatsService();

        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        // вызываем целевой метод:
        long actual = service.minimumSales(proceeds);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatemonthBelowAverage() {
        StatsService service = new StatsService();

        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        // вызываем целевой метод:
        long actual = service.monthBelowAverage(proceeds);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatemonthBeHigherAverage() {
        StatsService service = new StatsService();

        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        // вызываем целевой метод:
        long actual = service.monthBeHigherAverage(proceeds);

        assertEquals(expected, actual);
    }
}