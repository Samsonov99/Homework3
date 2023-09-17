public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int i = 746583;
        byte b = 127;
        short s = -32768;
        long l = 745679269629L;
        float f = -3.74789f;
        double d = 9.76587634876574;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = -159;
        byte b = 67;
        short s = 569;
        long l = 987678965549L;
        float f = 2.786f;
        double d = 27.12;
        char c = 27897;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte studLP = 23;
        byte studAS = 27;
        byte studEA = 30;
        short totalPaper = 480;
        int paper = totalPaper / (studAS + studEA + studLP);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int perMinute = 16 / 2;
        int a = perMinute * 20;
        int b = perMinute * 60 * 24;
        int c = b * 3;
        int d = b * 30;
        System.out.println("За 20 минут машина произвела " + a + " штук бутылок");
        System.out.println("За сутки машина произвела " + b + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + c + " штук бутылок");
        System.out.println("За месяц машина произвела " + d + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int total = 120;
        int white = 2;
        int brown = 4;
        int classroom = total / (white + brown);
        int whiteTotal = white * classroom;
        int brownTotal = brown * classroom;
        System.out.println("В школе, где " + classroom + " классов, нужно "
                + whiteTotal + " банок белой краски и "
                + brownTotal + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int icekream = 2 * 100;
        int eggs = 4 * 70;
        int gramm = bananas + milk + icekream + eggs;
        float kilo = (float)gramm/ 1000;
        System.out.println("Данный завтрак весит " + gramm + " грамм, что составляет "
        + kilo + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int excessKg = 7;
        int excessGr = excessKg * 1000;
        int a = 250;
        int b = 500;
        int dayA = excessGr / a;
        int dayB = excessGr / b;
        float average = (float)(dayA + dayB) / 2;
        System.out.println("Если спортсмен теряет в день " + a +
                " грамм, то для похудения, ему понадобится " + dayA +
                " дней. Если он теряет " + b + " грамм в день, то ему понадобится " +
                 dayB + " дней. В среднем это " + average + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int mashaYear = masha * 12;
        int denis = 83690;
        int denisYear = denis * 12;
        int kristina = 76230;
        int kristinaYear = kristina * 12;

        float rise = 0.1f;

        float mashaRise = masha + masha * rise;
        float denisRise = denis + denis * rise;
        float kristinaRise = kristina + kristina * rise;

        float mashaRiseYear = mashaYear + mashaYear * rise;
        float denisRiseYear = denisYear + denisYear * rise;
        float kristinaRiseYear = kristinaYear + kristinaYear * rise;

        float mashaYearDif = mashaRiseYear - mashaYear;
        float denisYearDif = denisRiseYear - denisYear;
        float kristinaYearDif = kristinaRiseYear - kristinaYear;

        System.out.println("Маша теперь получает " + mashaRise + " рублей. " +
                "Годовой доход вырос на " + mashaYearDif + " рублей");
        System.out.println("Денис теперь получает " + denisRise + " рублей. " +
                "Годовой доход вырос на " + denisYearDif + " рублей");
        System.out.println("Кристина теперь получает " + kristinaRise + " рублей. " +
                "Годовой доход вырос на " + kristinaYearDif + " рублей");
    }
}