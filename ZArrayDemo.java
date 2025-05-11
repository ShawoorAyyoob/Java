public class ZArrayDemo {
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 35;
        ages[1] = 20;
        ages[2] = 18;
        ages[3] = 40;
        ages[4] = 50;

        int index;
        for (int i = 0; i <= ages.length - 1; i++) {
            index = i + 1;
            System.out.println("Ages of Persons " + index + " = " + ages[i]);
        }
        for (int age : ages) {
             System.out.println("Ages of Persons " +  " = " + age);
        }
    }
}
