package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    private final int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
        // Сумма всех продаж
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        int expected = 180;

        int actual = service.totalSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Средняя сумма продаж в месяц
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        double expected = 15.0;

        double actual = service.averageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Номер месяца с минимальными продажами
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        int expected = 9; // сентябрь

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Номер месяца с максимальными продажами
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        int expected = 8; // август

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Количество месяцев с продажами ниже среднего
    void shouldCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.monthsBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
        // Количество месяцев с продажами выше среднего
    void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.monthsAboveAverage(sales);

        assertEquals(expected, actual);
    }
}

//  -------------------------------------------------------
//[INFO]  T E S T S
//[INFO] -------------------------------------------------------
//[INFO] Running ru.netology.stats.StatsServiceTest
//[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.025 s - in ru.netology.stats.StatsServiceTest
//[INFO]
//[INFO] Results:
//[INFO]
//[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
//[INFO]
//[INFO] ------------------------------------------------------------------------
//[INFO] BUILD SUCCESS
//[INFO] ------------------------------------------------------------------------