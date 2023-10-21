package Lesson4;

public class Polindrome {
    public static void main(String[] args) {
        // 235
        int[] palindrome = {2,3,1,3,2};
        boolean isPalindrome = false;

        for (int i = 0,j =  palindrome.length-1;i < palindrome.length;i++,j--){
            if (palindrome[i] != palindrome[j]){
                isPalindrome = false;
            }else{
                isPalindrome = true;
            }
        }
        if (isPalindrome){
            System.out.println("Это полиндром");
        }else {
            System.out.println("Это не полиндром");
        }
    }
}
