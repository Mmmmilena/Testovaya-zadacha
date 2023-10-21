package Lesson5;

public class HomeWork {
    public static void main(String[] args) {
        printResultMethod();


    }

    //    Создать метод который будет принимать double число (рубли) и символ валюты в которую нужно перевести (рубли),
//    валюты евро-'€', доллары-'$',фунты -'£'
//    вернуть метод должен сконвертированную число double в
//    соответствии с указанным в аргументах символом.
//(Мини конвектор валют)
    static double сurrencyConverter(double a, char c) {
        char EUR = '€';
        char USD = '$';
        char GBP = '£';
        double curseEuro = 82.65;
        double curseDollar = 71.29;
        double curseFunt = 95.65;
        double request = 0;

        if (c == EUR) {
            request = a / curseDollar;
        } else if (c == USD) {
            request = a / curseEuro;
        } else if (c == GBP) {
            request = a / curseFunt;
        } else {
            System.out.println("Неизвестная валюта");
        }
        return request;
    }

    //    Cоздать метод который будет определять число палиндром  или нет то есть вернет true или false;
    static boolean isPalindrome(int numbers) {
        int number = numbers;
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }

        int[] array = new int[count];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = numbers % 10;
            numbers /= 10;

        }
        boolean isPalindrome = false;

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if (array[i] != array[j]) {
                isPalindrome = false;
            } else {
                isPalindrome = true;
            }
        }
        if (isPalindrome) {
            return true;
        } else {
            return false;
        }

    }

    //2) Создать метод который принимает три числа double, а возвращает отсортированный массив элементами которого будут  три полученных из аргументов числа double.
    public static double[] getSortArray(double a, double b, double c) {
        double[] array = {a, b, c};
        sortArrayDouble(array);
        return array;
    }

    static void sortArrayDouble(double[] arrayDoubles) {
        boolean inSort = false;
        double save = 0;

        while (!inSort) {
            inSort = true;
            for (int i = 0; i < arrayDoubles.length - 1; i++) {
                if (arrayDoubles[i] > arrayDoubles[i + 1]) {
                    inSort = false;

                    save = arrayDoubles[i];
                    arrayDoubles[i] = arrayDoubles[i + 1];
                    arrayDoubles[i + 1] = save;
                }
            }
        }
    }

    //    И наконец метод который печатает результат выполнения всех вышеописанных методов.
    static void printResultMethod() {
        System.out.println(isPalindrome(1221));
        System.out.println(сurrencyConverter(1000, '$'));
        System.out.println(сurrencyConverter(1000, '€'));
        System.out.println(сurrencyConverter(1000, '£'));
        double[] array = getSortArray(2.5, 4.6, 1.3);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
