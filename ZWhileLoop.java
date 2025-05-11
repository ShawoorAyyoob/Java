public class ZWhileLoop {
    public static void main(String[] args) {
        printTable(5);
        printTable(10);

    }
    public static void printTable(int n) {
        System.out.println("**** Multiplication table of " + n + " ****");
        int i = 1;
        while (i <= 10){
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }
    }
}
