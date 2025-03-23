package ru.netology.stats;

public class StatsService {

    public int sumAllSale(int[] sum) {
        int sale = 0;
        for (int s : sum) {
            sale = s + sale;
        }
        return sale;
    }

    public int averageSumAllSale(int[] sum) {
        //int average = sumAllSale(sum) / sum.length;
        // return average;
        int average = 0;
        for (int a : sum) {
            average = a + average;
        }
        return average / sum.length;
    }

    public int peakSale(int[] sum) {
        int peak = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] >= sum[peak]) {
                peak = i;
            }
        }
        return peak;
    }

    public int minSale(int[] sum) {
        int min = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] <= sum[min]) {
                min = i;
            }
        }
        return min;
    }
}

