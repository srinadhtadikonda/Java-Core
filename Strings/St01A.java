import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        String x;

        System.out.print("Enter String..: ");
        x = SC.nextLine();

        int len = 0;

        // finding length using loop
        try {
            for (;;) {
                x.charAt(len);
                len++;
            }
        } catch (Exception e) {
            // loop stops when index goes out of range
        }

        System.out.println("String = " + x);
        System.out.println("Length = " + len);
    }
}
