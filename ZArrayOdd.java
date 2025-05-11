public class ZArrayOdd {
   public static void main(String[] args) {
       int[] numbers = { 2, 5, 9, 8, 3, 1 };
       int odd = 0, even = 0;
       for (int num : numbers) {
           if (num % 2 == 0) {
               even++;
           } else {
               odd++;
           }
       }
       System.out.println("Even Numbers = " + even);
       System.out.println("Odd Numbers = " + odd);
   }
}