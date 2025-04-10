public class IfElse {

    public static void main(String[] args) {
        printOddOrEven(12);
    }

    public static void printOddOrEven(int n) {
        int remainder = n % 2;
        if (remainder == 0) {
            System.out.println(n + " Even Number");
        } else {
            System.out.println(n + " Odd Number");
        }
    }
}