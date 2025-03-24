package ru.netology.stats;

public class StatsService {

    public int sumAllSale(int[] arr) {

        int summSale = 0;
        for (int sale : arr) {
            summSale = sale + summSale;
        }
        return summSale;
    }

    public int averageSumAllSale(int[] arr) {
        int average = sumAllSale(arr) / arr.length;
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

    public int quantityMonthSaleMin(int[] arr) {
        int quantityMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < averageSumAllSale(arr)) {
                quantityMin++;
            }
        }
        return quantityMin;
    }

    public int quantityMonthSaleMax(int[] arr) {
        int quantityMax = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > averageSumAllSale(arr)) {
                quantityMax++;
            }
        }
        return quantityMax;
    }
}

