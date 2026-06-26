import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

        for (char ch : arr) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else {
                symbols++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
        System.out.println("Symbols = " + symbols);
    }
}
