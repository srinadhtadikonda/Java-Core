public class StringLength {
    public static void main(String[] args) {
        String str = "Hello";

        char[] ch = str.toCharArray();
        int count = 0;

        for (char c : ch) {
            count++;
        }

        System.out.println("Length = " + count);
    }
}
