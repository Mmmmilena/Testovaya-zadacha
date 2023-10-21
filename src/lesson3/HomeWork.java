package lesson3;

public class HomeWork {
    public static void main(String[] args) {
        int week;
        int day;
        int hour = 0;
        int minute;
        int javaWorkPlanWeek = 21;
        int javaWorkPlanDay = 3;
        int javaWork = 0;
        int pageCount = 0;
        boolean isWeekend = false;
        int run = 0;


        WEEK:
        for (week = 1; week <= 1; week++) {
            System.out.println("Начало недели ");
            System.out.println("План на неделю:");
            System.out.println("Прочитать 100 страниц");
            System.out.println("Пробежать 30 км");
            System.out.println("Делать зарядку по утрам  ");
            System.out.println("Уделить Java " + javaWorkPlanWeek + " час");
            DAY:
            for (day = 1; day <= 7; day++) {
                isWeekend = (day > 5) ? true : false;
                if (day == 1) {
                    System.out.println("День " + day + "-й Понедельник");
                } else if (day == 2) {
                    System.out.println("День " + day + "-й Вторник");
                } else if (day == 3) {
                    System.out.println("День " + day + "-й Среда");
                } else if (day == 4) {
                    System.out.println("День " + day + "-й Четверг");
                } else if (day == 5) {
                    System.out.println("День " + day + "-й Пятница");
                } else if (day == 6) {
                    System.out.println("День " + day + "-й Суббота");
                } else if (day == 7) {
                    System.out.println("День " + day + "-й Воскресенье");
                }

                HOUR:
                for (hour = 0; hour <= 23; hour++) {
                    if (!isWeekend) {
                        if (hour == 0) {
                            System.out.println("Ночь");
                            System.out.println("Сплю");
                        } else if (hour == 6) {
                            System.out.println("Утро");
                            System.out.println("Проснулся ");
                        } else if (hour == 7) {
                            System.out.println("Занимаюсь зарядкой бегаю");
                            run += 4;

                        } else if (hour == 8) {
                            System.out.println("Завтракаю  потом читаю");
                            pageCount += 15;
                        } else if (hour == 9) {
                            System.out.println("Работаю");
                        } else if (hour == 12) {
                            System.out.println("День");
                            System.out.println("Обедаю");
                        } else if (hour == 18) {
                            System.out.println("Вечер");
                            System.out.println("Закончил работать ");
                            System.out.println("Ужин");
                        } else if (hour == 19) {
                            System.out.println("Занимаюсь Java");
                            javaWork += 3;
                        } else if (hour == 22) {
                            System.out.println("...");
                        }
                    }
                    MINUTES:
                    for (minute = 0; minute <= 59; minute++) {

                        if (hour < 4 || hour > 23) {
                            System.out.println(hour + " : " + minute);

                        } else if (hour >= 4 && hour < 11) {
                            System.out.println(hour + " : " + minute);
                        } else if (hour >= 11 && hour < 18) {
                            System.out.println( hour + " : " + minute);
                        } else if (hour >= 18 && hour <= 23) {
                            System.out.println( hour + " : " + minute);
                        }


                    }


//                    System.out.println("Неделя " + week + " День " + day + " Час " + hour + " Минута " + minute);
                }
            }
        }
    }
}


