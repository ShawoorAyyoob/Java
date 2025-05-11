public class ZArraySum {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 12 };
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("Sum of Numbers = " + sum);
    }
}