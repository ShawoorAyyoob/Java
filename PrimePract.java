public class PrimePract {
    public static void main(StringDemo[] args) {
        printPrimeNo(109);
        printPrimeNo(26);
        printPrimeNo(17);
    }
    public static void printPrimeNo(int n) {
        boolean prime = true; 
        for (int i = 2; i < n; i++) {
            int remainder = n % i;
            if (remainder == 0) {
                prime = false;
                break;
            }
        }
         if (prime == true) {
            System.out.println( n + " is a Prime Number");
         } else {
             System.out.println(n + " is not a Prime Number");
         }
    }
}