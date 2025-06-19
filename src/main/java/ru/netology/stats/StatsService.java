package ru.netology.stats;

public class StatsService {

    public long sumSales(long sales[]) {                //сумма всех продаж;
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;

    }

    public long averageSumSales(long sales[]) {         //средняя сумма продаж в месяц;
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        long averag = sum / 12;

        return averag;
    }

    public int monthNumberMax(long sales[]) {           //номер месяца, в котором был пик продаж
        int maxMonth = 0;      // номер месяца с максимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {      //  занчение в рассмотренном месяце продаж
                maxMonth = i;  // максимальное значение
            }
        }
        return maxMonth + 1; //номер месяца +1
    }


    public int monthNumberMin(long sales[]) {          //номер месяца, в котором был минимум продаж
        int minMonth = 0;      // номер месяца с максимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {      //  занчение в рассмотренном месяце продаж
                minMonth = i;  // максимальное значение
            }
        }
        return minMonth + 1; //номер месяца +1
    }

    public int monthbelowAverage(long[] sales) {         //количество месяцев, в которых продажи были ниже среднего
        int numberMonth = 0;
        long averag = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < averag)
                numberMonth++;
        }
        return numberMonth;
    }

    public int monthbeHigherAverage(long[] sales) {      //количество месяцев, в которых продажи были выше среднего
        int numberMonthHigher = 0;
        long averag = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > averag)
                numberMonthHigher++;
        }
        return numberMonthHigher;
    }
}



