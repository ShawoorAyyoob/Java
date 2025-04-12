public class Fizz {
    public static void main(String[] args) {
        printFizz(1,10);
    }

    public static void printFizz(int n1, int n2) {
        int remainder;
        for (int i = n1; i <= n2; i++) {
            remainder = i % 3;
            if (remainder == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        }
    }
