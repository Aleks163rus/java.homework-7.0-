package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void testSumSales() {
        StatsService service = new StatsService();

        long sales[] = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);       // полученный результат
        long expekted = 180;                        //ожидаемый результат

        Assertions.assertEquals(actual, expekted);
    }

    @Test

    public void averageSumSales() {
        StatsService service = new StatsService();

        long sales[] = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSumSales(sales);       // полученный результат
        long expekted = 15;                        //ожидаемый результат

        Assertions.assertEquals(actual, expekted);
    }

    @Test

    public void monthNumberMax() {
        StatsService service = new StatsService();

        long sales[] = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthNumberMax(sales);       // полученный результат
        long expekted = 8;                        //ожидаемый результат

        Assertions.assertEquals(actual, expekted);
    }


    @Test

    public void monthNumberMin() {
        StatsService service = new StatsService();

        long sales[] = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthNumberMin(sales);       // полученный результат
        long expekted = 9;                        //ожидаемый результат

        Assertions.assertEquals(actual, expekted);
    }

    @Test

    public void monthbelowAverage() {
        StatsService service = new StatsService();

        long sales[] = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthbelowAverage(sales);       // полученный результат
        long expekted = 5;                        //ожидаемый результат

        Assertions.assertEquals(actual, expekted);
    }

    @Test

    public void monthbeHigherAverage() {
        StatsService service = new StatsService();

        long sales[] = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthbeHigherAverage(sales);       // полученный результат
        long expekted = 5;                        //ожидаемый результат

        Assertions.assertEquals(actual, expekted);
    }
}
