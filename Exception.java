public class Exception {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = divide(a, b);
            System.out.println("Result " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception is caused by " + e.getMessage());
        }
        System.out.println("The division method continues ->");
    }

    public static int divide(int x, int y) {
        int result = x / y;
        return result;
    }
}