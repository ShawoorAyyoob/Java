public class StringBuilderAsg {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" Hello World!");
        sb.append(" How are you?");
        System.out.println("After appending: " + sb);

        sb.insert(0," Java");
        System.out.println("After inserting: " + sb);

        sb.replace(11, 17," Universe");
        System.out.println("After Replacing: " + sb);

        sb.deleteCharAt(20);
        System.out.println("After Deleting: " + sb);

        sb.reverse();
        System.out.println("After Reversing: " + sb);

        String finalString = sb.toString();
        System.out.println("New String: " + finalString);
    }
}
