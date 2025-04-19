public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = { 22, 45, 6, 8, 12 };
        int max = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum Number = " + max);
    }
}
