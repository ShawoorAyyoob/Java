class Intro {
    
    public static void main(StringDemo[] args) {
        System.out.println("Hello World");
        int result = add(10, 20);
        System.out.println("Sum = " + result);
        float result2 = divisible(30, 15);
        System.out.println("Result of divsion = " + result2);
    }

    public static int add(int x , int y ) {
        int sum = x + y;
        System.out.println("Sum = " + sum);
        return sum;
    }

    public static float divisible (int a, int b) {
        float result =  a / b;
        System.out.println("Remainder = " + result);
        return result;
    }
}