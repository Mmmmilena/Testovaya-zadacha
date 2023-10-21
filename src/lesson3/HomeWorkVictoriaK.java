package lesson3;

public class HomeWorkVictoriaK {
    public static void main(String[] args) {

    double mustHaveDayTimeJava = 2.5;
    double javaHoursSpent = 0;
    double count = 0;
    String[] weekDays = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};

        System.out.println("Начало недели (первая неделя)\n" +
                "на обучение Java я должна потратить " + mustHaveDayTimeJava +" часов в день и " + mustHaveDayTimeJava * 7 + " часов в неделю.\n");

        for (int day = 0; day < 7; day++) {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                // будни каждый день
                if (day <= 4 && hour == 6 && minute == 30) {
                    System.out.println(weekDays[day] + " (будни) Утро " + hour + ":" + minute + "  Проснулась");
                }
                if (day <= 4 && hour == 6 && minute > 30) {
                    System.out.println(weekDays[day] + " (будни) Утро " + hour + ":" + minute + "  Делаю зарядку");
                }
                if (day <= 4 && hour == 7 && minute <= 30) {
                    System.out.println(weekDays[day] + " (будни) Утро " + hour + ":" + minute + "  Принимаю душ");
                }
                if (day <= 4 && hour == 7 && minute > 30) {
                    System.out.println(weekDays[day] + " (будни) Утро " + hour + ":" + minute + "  Завтракаю");
                }
                if (day <= 4 && hour == 8) {
                    System.out.println(weekDays[day] + " (будни) Утро " + hour + ":" + minute + "  Еду на работу");
                }
                if (day <= 4 && hour >= 9 && hour < 11) {
                    System.out.println(weekDays[day] + " (будни) Утро " + hour + ":" + minute + "  Работаю");
                }
                if (day <= 4 && hour >= 11 && hour < 16) {
                    System.out.println(weekDays[day] + " (будни) День " + hour + ":" + minute + "  Работаю");
                }
                if (day <= 4 && hour >= 16 && hour < 18) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Работаю");
                }

                // будни с курсами
                if (day == 0 && hour == 18 || day == 2 && hour == 18 ||
                        day == 3 && hour == 18) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Еду на занятия");
                }
                if (day == 0 && (hour == 19 && minute < 30) || day == 2 && (hour == 19 && minute < 30) ||
                        day == 3 && (hour == 19 && minute < 30)) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Ужинаю");
                }
                if ((day == 0 && hour == 19 && minute > 30) || (day == 0 && hour == 21 && minute < 30) ||
                        (day == 2 && hour == 19 && minute > 30) || (day == 2 && hour == 21 && minute < 30) ||
                        (day == 3 && hour == 19 && minute > 30) || (day == 3 && hour == 21 && minute < 30)) {

                    javaHoursSpent = 2;

                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Лекция по Java");
                }
                if ((day == 0 && hour == 21 && minute > 30) || (day == 0 && hour == 22 && minute < 30) ||
                        (day == 2 && hour == 21 && minute > 30) || (day == 2 && hour == 22 && minute < 30) ||
                        (day == 3 && hour == 21 && minute > 30) || (day == 3 && hour == 22 && minute < 30)) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Еду домой");
                }
                if (day == 0 && hour == 22 && minute >= 30 || day == 2 && hour == 22 && minute >= 30 ||
                        day == 3 && hour == 22 && minute >= 30) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Готовлюсь ко сну");
                }

                // будни без курсов
                if (day == 1 && hour == 18 || day == 4 && hour == 18) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Еду домой");
                }
                if (day == 1 && hour == 19 && minute <= 30 || day == 4 && hour == 19 && minute <= 30) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Ужинаю");
                }
                if (day == 1 && hour == 19 && minute > 30 || day == 4 && hour == 19 && minute > 30) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Отдыхаю");
                }
                if (day == 1 && hour >= 20 && hour <= 22 && minute <= 30 ||
                        day == 4 && hour >= 20 && hour <= 22 && minute <= 30) {

                    javaHoursSpent = 2.5;

                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Домашка по Java");
                }
                if (day == 1 && hour == 22 && minute >= 30 || day == 4 && hour == 22 && minute >= 30) {
                    System.out.println(weekDays[day] + " (будни) Вечер " + hour + ":" + minute + "  Готовлюсь ко сну");
                }

                //выходные
                if (day == 5 && hour <= 3 || day == 6 && hour <= 3) {
                    System.out.println(weekDays[day] + " (выходной) Ночь " + hour + ":" + minute + "  Сплю");
                }
                if (day == 5 && hour >= 11 && hour < 13 || day == 6 && hour >= 11 && hour < 13) {
                    System.out.println(weekDays[day] + " (выходной) День " + hour + ":" + minute + "  Домашние дела");
                }
                if (day == 5 && hour == 13) {
                    System.out.println(weekDays[day] + " (выходной) День " + hour + ":" + minute + "  Еду на занятия");
                }
                if (day == 5 && hour >= 14 && hour < 16) {

                    javaHoursSpent = 2;

                    System.out.println(weekDays[day] + " (выходной) День " + hour + ":" + minute + "  Лекция по Java");
                }
                if (day == 5 && hour == 16) {
                    System.out.println(weekDays[day] + " (выходной) Вечер " + hour + ":" + minute + "  Еду домой");
                }
                if (day == 5 && hour == 17) {
                    System.out.println(weekDays[day] + " (выходной) Вечер " + hour + ":" + minute + "  Отдыхаю");
                }
                if (day == 5 && hour >= 18 && hour < 22) {
                    System.out.println(weekDays[day] + " (выходной) Вечер " + hour + ":" + minute + "  Встреча с друзьями");
                }
                if (day == 5 && hour == 22) {
                    System.out.println(weekDays[day] + " (выходной) Вечер " + hour + ":" + minute + "  Читаю");
                }
                if (day == 5 && hour == 23 && minute <= 30) {
                    System.out.println(weekDays[day] + " (выходной) Ночь " + hour + ":" + minute + "  Готовлюсь ко сну");
                }
                if (day == 5 && hour == 23 && minute >= 30) {
                    System.out.println(weekDays[day] + " (выходной) Ночь " + hour + ":" + minute + "  Сплю");
                }
                if (day == 6 && hour >= 13 && hour < 16) {

                    javaHoursSpent = 3;

                    System.out.println(weekDays[day] + " (выходной) День " + hour + ":" + minute + "  Домашка по Java");
                }
                if (day == 6 && hour >= 16 && hour <= 18) {
                    System.out.println(weekDays[day] + " (выходной) Вечер " + hour + ":" + minute + "  Гуляю");
                }
                if (day == 6 && hour >= 19 && hour <= 20) {
                    System.out.println(weekDays[day] + " (выходной) Вечер " + hour + ":" + minute + "  Домашние дела");
                }
                if (day == 6 && hour >= 21 && hour < 23) {
                    System.out.println(weekDays[day] + " (выходной) Вечер " + hour + ":" + minute + "  Читаю");
                }
                if (day == 6 && hour == 23 && minute <= 30) {
                    System.out.println(weekDays[day] + " (выходной) Ночь " + hour + ":" + minute + "  Готовлюсь ко сну");
                }
                if (day == 6 && hour == 23 && minute >= 30) {
                    System.out.println(weekDays[day] + " (выходной) Ночь " + hour + ":" + minute + "  Сплю");
                }
            }
        }
        if (javaHoursSpent >= mustHaveDayTimeJava) {
            count++;
            System.out.println("\nЭто успешный день!!!\n");
        } else {
            System.out.println("\nЭто неуспешный день:(\n");
        }
    }
        System.out.println("Количество успешных дней: " + count);

        if (count / 7 * 100 > 80) {
        System.out.println("Неделя успешная, план не выполнен на " + count / 7 * 100 + " % !!!");
    } else {
        System.out.println("Неделя неуспешная, план не выполнен на 80% :(");
    }
}
}