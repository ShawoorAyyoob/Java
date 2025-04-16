public class Array2 {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 11;
        number[1] = 14;
        number[2] = 51;
        number[3] = 9;
        number[4] = 7;

        int min = number[0];
        for (int i = 1; i <= number.length - 1; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println(min);
    }
}
