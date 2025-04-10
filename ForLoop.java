public class ForLoop {
    public static void main(String[] args) {
        printTable(4);
    }

    public static void printTable (int n) {
        System.out.println("**** Multiplication table of " + n + " ****");
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}