// Step 1 - reverse Number
// Step 2- Compare the orginal with reversed number.

public class Palindrome {
    public static void main(String[] args) {
        int orignalNo = 12321;
        int reversedNo = reverse(orignalNo);
        compareNo(orignalNo, reversedNo);
    }

    public static int reverse(int n) {
        int remainder;
        int reversedNo = 0;
        while (n != 0) {
            remainder = n % 10;
            n = n / 10;
            reversedNo = reversedNo * 10 + remainder;
        }
        return reversedNo;
        // System.out.println(" Palindrome of " + orignalNo + " = " + reversedNo);
    }

    public static void compareNo(int orignalNo, int reversedNo) {
        if (orignalNo == reversedNo) {
            System.out.println(orignalNo + " is a palindrome");
        } else {
            System.out.println(orignalNo + " is not a palindrome");

        }
    }
}
