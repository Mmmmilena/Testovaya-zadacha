//import java.util.Scanner;
//
//public class Kalkulyator1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        try {
//            String result = calc(input);
//            System.out.println(result);
//        } catch (IllegalArgumentException e) {
//            System.out.println("oshibka");
//        }
//
//    }
//
//    public static String calc(String input) {
//        String[] parts = input.split(" ");
//        if (parts.length != 3) {
//            throw new IllegalArgumentException("Неверное арифмитическое выражение");
//        }
//
//        int a, b;
//        try {
//            a = Integer.parseInt(parts[0]);
//            b = Integer.parseInt(parts[2]);
//            if (a < 1 || a > 10 || b < 1 || b > 10) {
//                throw new IllegalArgumentException("Калькулятор должен принимать на вход числа от 1 до 10");
//            }
//
//            String operator = parts[1];
//            int result;
//            switch (operator) {
//                case "+":
//                    result = a + b;
//                    break;
//                case "-":
//                    result = a - b;
//                    break;
//                case "*":
//                    result = a * b;
//                    break;
//                case "/":
//                    if (b == 0) {
//                        throw new ArithmeticException("Деление на ноль");
//                    }
//                    result = a / b;
//                    break;
//                default:
//                    throw new IllegalArgumentException("Неправильный оператор");
//            }
//
//
//        return String.valueOf(result);
//    } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//
//
//        return input;
//    }
//
