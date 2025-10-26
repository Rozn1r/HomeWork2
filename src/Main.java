//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



            byte myByte = 100;
            short myShort = 20000;
            int myInt = 1000000;
            long myLong = 123456789L;
            float myFloat = 3.14f;
            double myDouble = 2.71828;


            System.out.println("Значение переменной myByte с типом byte равно " + myByte);
            System.out.println("Значение переменной myShort с типом short равно " + myShort);
            System.out.println("Значение переменной myInt с типом int равно " + myInt);
            System.out.println("Значение переменной myLong с типом long равно " + myLong);
            System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
            System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

            double value1 = 27.12;
            long value2 = 987678965549L;
            float value3 = 2.786f;
            short value4 = 569;
            short value5 = -159;
            int value6 = 27897;
            byte value7 = 67;

            System.out.println( "Значение переменной value1 с типом double равно " + value1);
            System.out.println("Значение переменной value2 с типом long равно " + value2);
            System.out.println("Значение переменной value3 с типом float равно " + value3);
            System.out.println("Значение переменной value4 с типом short равно " + value4);
            System.out.println("Значение переменной value5 с типом short равно " + value5);
            System.out.println("Значение переменной value6 с типом int равно " + value6);
            System.out.println("Значение переменной value7 с типом byte равно " + value7);


            int studentsLudmila = 23;
            int studentsAnna = 27;
            int studentsEkaterina = 30;
            int totalPaper = 480;

            int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
            int paperPerStudent = totalPaper / totalStudents;

            System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

            int bottlesPer2Minutes = 16;
            int bottlesPerMinute = bottlesPer2Minutes / 2;

            int minutes20 = 20 * bottlesPerMinute;
            int dayMinutes = 24 * 60 * bottlesPerMinute;
            int threeDays = 3 * dayMinutes;
            int month = 30 * dayMinutes;


            System.out.println("За 20 минут машина произвела " + minutes20 + " штук бутылок");
            System.out.println("За сутки машина произвела " + dayMinutes + " штук бутылок");
            System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
            System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");

            int totalCans = 120;
            int whitePerClass = 2;
            int brownPerClass = 4;

            int classes = totalCans / (whitePerClass + brownPerClass);
            int whiteCans = classes * whitePerClass;
            int brownCans = classes * brownPerClass;

            System.out.println("В школе, где " + classes + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");


            int bananasCount = 5;
            int bananaWeight = 80;
            int milkMl = 200;
            int milkWeightPer100Ml = 105;
            int iceCreamCount = 2;
            int iceCreamWeight = 100;
            int eggsCount = 4;
            int eggWeight = 70;

            int totalGrams = (bananasCount * bananaWeight) + (milkMl * milkWeightPer100Ml / 100) + (iceCreamCount * iceCreamWeight) + (eggsCount * eggWeight);

            double totalKg = totalGrams / 1000.0;

            System.out.println("Вес завтрака: " + totalGrams + " грамм или " + totalKg + " кг");

            int targetWeightLoss = 7;
            int minDailyLoss = 250;
            int maxDailyLoss = 500;

            int daysMin = targetWeightLoss * 1000 / minDailyLoss;
            int daysMax = targetWeightLoss * 1000 / maxDailyLoss;
            int averageDays = (daysMin + daysMax) / 2;

            System.out.println("При потере 250 грамм в день: " + daysMin + " дней");
            System.out.println("При потере 500 грамм в день: " + daysMax + " дней");
            System.out.println("В среднем потребуется: " + averageDays + " дней");

            int mashaSalary = 67760;
            int denisSalary = 83690;
            int kristinaSalary = 76230;


            int mashaNew = mashaSalary + (mashaSalary * 10 / 100);
            int denisNew = denisSalary + (denisSalary * 10 / 100);
            int kristinaNew = kristinaSalary + (kristinaSalary * 10 / 100);


            int mashaDiff = (mashaNew - mashaSalary) * 12;
            int denisDiff = (denisNew - denisSalary) * 12;
            int kristinaDiff = (kristinaNew - kristinaSalary) * 12;

            System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
            System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
            System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей");




        }

}