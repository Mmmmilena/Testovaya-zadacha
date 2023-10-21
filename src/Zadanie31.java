public class Zadanie31 {
    public static void main(String[] args) {
        String a = " Привет, меня, зовут";
        abc(a);
    }
    public static void abc(String a) {
        for (int i = 0; i < a.length(); i++) {
            char result = a.charAt(i);
            System.out.println(result);
        }
    }
}
