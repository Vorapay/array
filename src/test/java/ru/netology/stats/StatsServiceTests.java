package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.sumAllSale(sum);

        Assertions.assertEquals(expectedSales, actualSales);


    }

    @Test
    public void averageSumAllSales() {
        StatsServiceTests service = new StatsServiceTests();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSumAllSale(sum);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void peakSales() {
        StatsServiceTests service = new StatsServiceTests();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedPeak = 7;
        int actualPeak = service.peakSale(sum);

        Assertions.assertEquals(expectedPeak, actualPeak);
    }

    @Test
    public void minkSales() {
        StatsServiceTests service = new StatsServiceTests();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 8;
        int actualMin = service.minSale(sum);

        Assertions.assertEquals(expectedMin, actualMin);
    }
}
