public class Exception3 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        try {
            numbers[20] = 1000;
            System.out.println(numbers[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception is caused by " + e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}
