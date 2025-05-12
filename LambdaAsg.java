@FunctionalInterface
interface SquareCalculator {
    int calculateSquare(int n);
}

public class LambdaAsg {
    public static void main(String[] args) {
        SquareCalculator sqaure = (n) -> {return n * n;};
    System.out.println("Sqaure of Number = " + sqaure.calculateSquare(5) );}
}