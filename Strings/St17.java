import java.util.*;

class Main {

    static char[] toArray(String s) {
        char[] arr = new char[1000];
        int i = 0;
        for (char c : s.toCharArray()) {
            arr[i++] = c;
        }
        return Arrays.copyOf(arr, i);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Count Words");
            System.out.println("2. Count Alphabets (with spaces)");
            System.out.println("3. Count Alphabets (without spaces)");
            System.out.println("4. Count Vowels, Consonants, Digits, Spaces, Symbols");
            System.out.println("5. Reverse String");
            System.out.println("6. Palindrome Check");
            System.out.println("7. Anagram Check");
            System.out.println("8. Convert to Lowercase");
            System.out.println("9. Convert to Uppercase");
            System.out.println("10. Frequency of Characters");
            System.out.println("11. Remove Duplicate Characters");
            System.out.println("12. Most Repeated Character");
            System.out.println("13. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int words = 1;
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == ' ')
                            words++;
                    }
                    System.out.println("Words = " + words);
                    break;

                case 2:
                    System.out.println("Alphabets (with spaces) = " + str.length());
                    break;

                case 3:
                    int alpha = 0;
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) != ' ')
                            alpha++;
                    }
                    System.out.println("Alphabets (without spaces) = " + alpha);
                    break;

                case 4:
                    int v = 0, c = 0, d = 0, s = 0, sym = 0;

                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);

                        if (ch == ' ') s++;
                        else if (ch >= '0' && ch <= '9') d++;
                        else if ("aeiouAEIOU".indexOf(ch) >= 0) v++;
                        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) c++;
                        else sym++;
                    }

                    System.out.println("Vowels = " + v);
                    System.out.println("Consonants = " + c);
                    System.out.println("Digits = " + d);
                    System.out.println("Spaces = " + s);
                    System.out.println("Symbols = " + sym);
                    break;

                case 5:
                    System.out.print("Reverse: ");
                    for (int i = str.length() - 1; i >= 0; i--) {
                        System.out.print(str.charAt(i));
                    }
                    System.out.println();
                    break;

                case 6:
                    boolean pal = true;
                    int i = 0, j = str.length() - 1;

                    while (i < j) {
                        if (str.charAt(i) != str.charAt(j)) {
                            pal = false;
                            break;
                        }
                        i++; j--;
                    }

                    System.out.println(pal ? "Palindrome" : "Not Palindrome");
                    break;

                case 7:
                    System.out.print("Enter second string: ");
                    String s2 = sc.next();

                    char[] a1 = toArray(str.replace(" ", ""));
                    char[] a2 = toArray(s2.replace(" ", ""));

                    if (a1.length != a2.length) {
                        System.out.println("Not Anagram");
                        break;
                    }

                    boolean[] used = new boolean[a2.length];
                    boolean anagram = true;

                    for (i = 0; i < a1.length; i++) {
                        boolean found = false;

                        for (int k = 0; k < a2.length; k++) {
                            if (!used[k] && a1[i] == a2[k]) {
                                used[k] = true;
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            anagram = false;
                            break;
                        }
                    }

                    System.out.println(anagram ? "Anagram" : "Not Anagram");
                    break;

                case 8:
                    System.out.print("Lowercase: ");
                    for (i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);
                        if (ch >= 'A' && ch <= 'Z')
                            ch = (char)(ch + 32);
                        System.out.print(ch);
                    }
                    System.out.println();
                    break;

                case 9:
                    System.out.print("Uppercase: ");
                    for (i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);
                        if (ch >= 'a' && ch <= 'z')
                            ch = (char)(ch - 32);
                        System.out.print(ch);
                    }
                    System.out.println();
                    break;

                case 10:
                    System.out.println("Character Frequency:");
                    boolean[] visited = new boolean[str.length()];

                    for (i = 0; i < str.length(); i++) {
                        if (visited[i]) continue;

                        int count = 1;

                        for (int k = i + 1; k < str.length(); k++) {
                            if (str.charAt(i) == str.charAt(k)) {
                                count++;
                                visited[k] = true;
                            }
                        }

                        System.out.println(str.charAt(i) + " = " + count);
                    }
                    break;

                case 11:
                    System.out.print("Without Duplicates: ");
                    for (i = 0; i < str.length(); i++) {
                        boolean found = false;

                        for (int j1 = 0; j1 < i; j1++) {
                            if (str.charAt(i) == str.charAt(j1)) {
                                found = true;
                                break;
                            }
                        }

                        if (!found)
                            System.out.print(str.charAt(i));
                    }
                    System.out.println();
                    break;

                case 12:
                    int max = 0;
                    char maxChar = ' ';

                    for (i = 0; i < str.length(); i++) {
                        int count = 0;

                        for (int k = 0; k < str.length(); k++) {
                            if (str.charAt(i) == str.charAt(k))
                                count++;
                        }

                        if (count > max) {
                            max = count;
                            maxChar = str.charAt(i);
                        }
                    }

                    System.out.println("Most repeated character: " + maxChar);
                    break;

                case 13:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 13);
    }
}
