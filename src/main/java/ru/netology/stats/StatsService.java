package ru.netology.stats;

public class StatsService {

    public long sumAllSale(long[] arr) {

        long summSale = 0;
        for (long sale : arr) {
            summSale = sale + summSale;
        }
        return summSale;
    }

    public long averageSumAllSale(long[] arr) {
        long average = sumAllSale(arr) / arr.length;
        return average;
    }

    public int peakSale(int[] sum) {
        int peak = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] >= sum[peak]) {
                peak = i;
            }
        }
        return peak + 1;
    }

    public int minSale(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int quantityMonthSaleMin(long[] arr) {
        long averageValue = averageSumAllSale(arr);
        int quantityMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < averageValue) {
                quantityMin++;
            }
        }
        return quantityMin;
    }

    public int quantityMonthSaleMax(long[] arr) {
        long averageValue = averageSumAllSale(arr);
        int quantityMax = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > averageValue) {
                quantityMax++;
            }
        }
        return quantityMax;
    }
}

