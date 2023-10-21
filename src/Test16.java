public class Test16 {
    public static void main(String[] args) {
        int a;
        int b;


            for (int i = 0; i < 100; i++) {

                try {
                    a = (int) (Math.random() * 2);
                    b = (int) (Math.random() * 2);
                    int c = a/b;
                    System.out.println(c);
                }
                catch (Exception e) {
                    System.out.println("Ошибка");
                }

            }
        }




    }

