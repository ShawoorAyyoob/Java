public class Array3 {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}