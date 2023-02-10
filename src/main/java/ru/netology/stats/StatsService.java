package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long selePerMonth = 0;
        for (long s : sales) {
            selePerMonth = selePerMonth + s;
        }
        return selePerMonth;
    }


    public long totalMidleSales(long[] sales) {
        long result = totalSales(sales);
        return result / 12;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int UnderMidleSales(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < totalMidleSales(sales)) {
                result++;
            }
        }
        return result;
    }

    public int OverMidleSales(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > totalMidleSales(sales)) {
                result++;
            }
        }
        return result;
    }

}
