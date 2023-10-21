package Lesson6;

public class StringMethods {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        System.out.println(a == b);
        String s1 = "Privet.zip";
        System.out.println(s1);
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(2));
//        System.out.println(s1.endsWith(".zip"));
//        System.out.println(s1.startsWith("p"));
        String s2 =  s1.trim();
       String s3 = new String("Privet.zip");
       String s4 = new String("Privet.zip");
        String s5 = "Privet  poka  kak dela";
        char[] chars =  s5.toCharArray();
        for (int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
       String[] strings =  s1.split(" ");
        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i] + " " + i);
        }







    }

}
