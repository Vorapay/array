package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.sumAllSale(arr);

        Assertions.assertEquals(expectedSales, actualSales);


    }

    @Test
    public void averageSumAllSales() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSumAllSale(arr);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void peakSales() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedPeak = 8;
        int actualPeak = service.peakSale(arr);

        Assertions.assertEquals(expectedPeak, actualPeak);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 9;
        int actualMin = service.minSale(arr);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void quantityMonthSaleMin() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMin = 5;
        int actualQuantityMin = service.quantityMonthSaleMin(arr);

        Assertions.assertEquals(expectedQuantityMin, actualQuantityMin);
    }

    @Test
    public void quantityMonthSaleMax() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMax = 5;
        int actualQuantityMax = service.quantityMonthSaleMax(arr);

        Assertions.assertEquals(expectedQuantityMax, actualQuantityMax);
    }
}

