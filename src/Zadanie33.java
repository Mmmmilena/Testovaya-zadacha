public class Zadanie33 {
    public static void main(String[] args) {
        String a = "Hello Java";
        abc(a);
    }
    public static void abc(String a) {
        for (int i = 1; i < a.length() + 1; i++) {
            String result = a.substring(0,i);
            System.out.println(result);


        }
    }
}
