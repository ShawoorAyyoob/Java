@FunctionalInterface
interface MathOperation {
    int operate(int x, int y);
}

public class Lambda2 {
    public static void main(String[] args) {
        MathOperation multiply = (a, b) -> {
            return a * b;
        };
        System.out.println("Result: " + multiply.operate(12, 2));
    }
}