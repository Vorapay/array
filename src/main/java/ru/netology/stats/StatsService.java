package ru.netology.stats;

public class StatsService {

    public int sumAllSales (int[] sales) {

        int sum = sales[0];
        for (int s : sales) {
            s = s + sum;
        }
        return sum;
    }

}
