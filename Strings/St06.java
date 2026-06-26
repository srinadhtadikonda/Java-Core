public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello World @123";

        int vowels = 0, consonants = 0, spaces = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else {
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Spaces = " + spaces);
        System.out.println("Special Characters = " + special);
    }
}
