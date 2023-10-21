import java.util.Scanner;

public class kalkulyator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("oshibka");
        }

    }

    public static String calc(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Неверное арифмитическое выражение");
        }
        int a = parseNumber(parts[0]);
        int b = parseNumber(parts[2]);

        int result;
        switch (parts[1]) {
            case "+":
                result = add(a,b);
                break;
            case "-":
                result = subtract(a,b);
                break;
            case "*":
                result = multiply(a,b);
                break;
            case "/":
                result = divide(a,b);
                break;
            default:
                throw new IllegalArgumentException("Неверный оператор");
        }
        return String.valueOf(result);
    }

    public static int parseNumber(String str) {
        try {
            int number = Integer.parseInt(str);
            if (number < 1 || number > 10) {
                throw new IllegalArgumentException("Калькулятор должен принимать на вход числа от 1 до 10");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Калькулятор должен принимать на вход числа от 1 до 10");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b==0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return a/b;
    }
}

