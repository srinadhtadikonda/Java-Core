import java.util.Scanner;

public class PrintStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter characters: ");
        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
