//remove repeating characters
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "banana";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(ch);
            }
        }
    }
}
