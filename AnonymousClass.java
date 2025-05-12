interface ICalculator {
    int add(int x, int y);
    int subtract(int x, int y);
}

public class AnonymousClass {
    public static void main(String[] args) {

        ICalculator calculator2 = new ICalculator() {                                                   

            @Override
            public int add(int x, int y) {
                return x + y;
            }

            @Override
            public int subtract(int x, int y) {
                return x - y;
            }
        };
        System.out.println(calculator2.add(20, 50));
    }
}