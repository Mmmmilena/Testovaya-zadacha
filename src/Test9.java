public class Test9 {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        abc(s);

    }
    public static void abc (String a) {
        System.out.println(a.charAt(a.length() - 1));
        System.out.println(a.endsWith("!!!"));
        System.out.println(a.startsWith("I like"));
        System.out.println(a.contains("Java"));
        System.out.println(a.indexOf("Java"));
        System.out.println(a.replaceAll("a", "b"));
        System.out.println(a.toUpperCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.substring(7,11));
    }
}
