package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        // Инициализация массива с данными
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Массив с названиями месяцев
        String[] monthNames = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж: " + service.totalSales(arr));
        System.out.println("Средняя сумма продаж: " + service.averageSales(arr));

        int minMonth = service.minSales(arr);
        System.out.println("Месяц минимальных продаж: " + monthNames[minMonth - 1] + " (месяц " + minMonth + ")");

        int maxMonth = service.maxSales(arr);
        System.out.println("Месяц максимальных продаж: " + monthNames[maxMonth - 1] + " (месяц " + maxMonth + ")");

        System.out.println("Количество месяцев ниже среднего: " + service.monthsBelowAverage(arr));
        System.out.println("Количество месяцев выше среднего: " + service.monthsAboveAverage(arr));
    }

    // Сумма всех продаж
    public int totalSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public double averageSales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return (double) totalSales(sales) / sales.length;
    }

    // Номер месяца с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;
    }

    // Номер месяца с максимальными продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    // Количество месяцев с продажами ниже среднего
    public int monthsBelowAverage(long[] sales) {
        double average = averageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }

        return count;
    }

    // Количество месяцев с продажами выше среднего
    public int monthsAboveAverage(long[] sales) {
        double average = averageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }

        return count;
    }
}

//Сумма всех продаж: 180
//Средняя сумма продаж: 15.0
//Месяц минимальных продаж: Сентябрь (месяц 9)
//Месяц максимальных продаж: Август (месяц 8)
//Количество месяцев ниже среднего: 5
//Количество месяцев выше среднего: 5
