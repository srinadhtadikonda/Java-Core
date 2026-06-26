public class UpperToLower {
    public static void main(String[] args) {
        String str = "HELLO WORLD";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            System.out.print(ch);
        }
    }
}
