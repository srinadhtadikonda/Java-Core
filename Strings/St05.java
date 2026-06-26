import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        System.out.print("Uppercase String: ");

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            System.out.print(ch);
        }
    }
}
