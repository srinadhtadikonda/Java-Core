public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";

        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        boolean flag = true;

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
