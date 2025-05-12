// Definition - An interface with only function is called Functional Interface.

@FunctionalInterface
interface IGreeting {
    void greet();
}

public class LambdaFunction {
    public static void main(String[] args) {
        IGreeting lambdaGreeting = () -> System.out.println("Hello Lambda. ");
        lambdaGreeting.greet();
    }
}