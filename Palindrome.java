public class Palindrome {
    public static void main(String[] args) {
        printPalindrome(204);
    }

    public static void printPalindrome(int n) {
        int remainder = n * 10;
        int palindromeNo = n;
        while (remainder != 0) {
            n = n / 10;
        }
        System.out.println(" Palindrome of " + palindromeNo + " = " + n);
    }
}
