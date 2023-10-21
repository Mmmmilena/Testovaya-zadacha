import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String [] s2 = s1.split( " ");
        String u = s2[0];
        for (String m: s2) {
            System.out.println(m);
            if (u.length() < m.length()) {
                u = m;
            }

        }
        System.out.println(u);



    }
}
