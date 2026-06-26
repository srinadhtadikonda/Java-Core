import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String x = sc.nextLine();

        char[] arr = x.toCharArray();  // convert to array

        int len = 0;

        for (char c : arr) {
            len++;
        }

        System.out.println("String = " + x);
        System.out.println("Length = " + len);
    }
}
