public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Charles");
        sb.append(" Xavier");
        System.out.println("Name: " + sb);

        sb.insert(0,"Professor ");
        System.out.println("New: " + sb);

        sb.replace(17, 24, " Lensher");
        System.out.println("Replaced Name: " + sb);

        sb.delete(17, 25);
        System.out.println("Deleted: " + sb);

        sb.reverse();
        System.out.println("Reversed: " + sb);

        System.out.println("Length: " + sb.length());

        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}
