package ru.netology.stats;

public class StatsService {


    public int calculateSum(int[] proceeds) {
        int summa = 0;
        for (int proceed : proceeds) {
            summa += proceed;
        }
        return summa;
    }

    public int monthlyAverage(int[] proceeds) {
        int sum = calculateSum(proceeds);

        return sum / proceeds.length;
    }

    public int maximumSales(int[] proceeds) {
        int proceedsMax = proceeds[0];
        int month = 0;
        int monthMax = 1;
        for (int proceed : proceeds) {
            month++;
            if (proceedsMax <= proceed) {
                proceedsMax = proceed;
                monthMax = month;
            }
        }
        return monthMax;
    }
    public int minimumSales(int[] proceeds){
        int proceedsMin = proceeds[0];
        int month = 0;
        int monthMin = 1;
        for (int proceed : proceeds) {
            month++;
            if (proceedsMin >= proceed) {
                proceedsMin = proceed;
                monthMin = month;
            }
        }
        return monthMin;
    }
    public int monthBelowAverage(int[] proceeds){
        int average = monthlyAverage(proceeds);
        int month = 0;
        for (int sale : proceeds){
            if (sale < average){
                month++;
            }
        }
        return month;
    }
    public int monthBeHigherAverage(int[] proceeds){
        int average = monthlyAverage(proceeds);
        int month = 0;
        for (int sale : proceeds){
            if (sale > average){
                month++;
            }
        }
        return month;
    }
}
