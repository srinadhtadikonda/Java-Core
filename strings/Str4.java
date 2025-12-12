package corejavaprograms;

public class Test {
    public static void main(String[] args) {

        String str = "State Bank of India 123 @#$";

        int alphabets = 0, digits = 0, spaces = 0, symbols = 0;
        int i = 0;

        // Count manually without using any built-in function
        try {
            while (true) {

                char ch = str.charAt(i);  // manually fetch characters

                // Check alphabet (A-Z or a-z) using ASCII values
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    alphabets++;
                }
                // Check digit (0-9)
                else if (ch >= '0' && ch <= '9') {
                    digits++;
                }
                // Check space
                else if (ch == ' ') {
                    spaces++;
                }
                // If not alphabet, digit, or space → symbol
                else {
                    symbols++;
                }

                i++;  // move to next character
            }

        } catch (Exception e) {
            // Loop stops when index goes out of range
        }

        System.out.println("String     : " + str);
        System.out.println("Alphabets  : " + alphabets);
        System.out.println("Digits     : " + digits);
        System.out.println("Spaces     : " + spaces);
        System.out.println("Symbols    : " + symbols);
    }
}
