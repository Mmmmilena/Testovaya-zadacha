public class Test17 {
    public static void main(String[] args) {

    }
    public static void abc (String login, String password, String confirmPassword) {
        if (login.length() > 20 || password.length() > 20) {
            try {
                throw new WrongLoginException();
            }
             catch (WrongLoginException e) {
                e.printStackTrace();
            }
        }
        else {
            int a = 0;
            for (int i = 0; i < login.length(); i++) {
                char result = login.charAt(i);
                if(Character.isDigit(result)) {
                    a = -1;
                    break;
                }

            }
            if (a == 0) {
                try {
                    throw  new Exception(" ");
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }


        }
    private static class WrongLoginException extends Throwable {
    }
}




