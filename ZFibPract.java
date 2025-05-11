public class ZFibPract {
    public static void main(StringDemo[] args) {
        printFibNo(5);
    }
    public static void printFibNo(int n) {
        int first = 1;
        int second = 1;
        int sum;

        System.out.println(first + " ");
        System.out.println(second + " ");

        for (int i = 3; i <= n; i++) {
            sum = first + second;
            System.out.println(sum + " ");
            first = second;
            second = sum;
        }
    }
}
