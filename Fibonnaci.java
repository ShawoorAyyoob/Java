public class Fibonnaci {
    public static void main(String[] args) {
        printFib(10);
    }

    public static void printFib(int n) {
        int first = 0;
        int second = 1;
        int sum;
        System.out.print(first + " ");
        System.out.print(second + " ");

        for (int i = 3; i <= n; i++) {
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
    }
}