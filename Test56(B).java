package corejavaprograms;
import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Your Name..: ");
        String input = SC.next();               // Read input as String
        StringBuilder x = new StringBuilder();  // Create StringBuilder
        x.append(input);                        // Append input to it

        // Optional: Display result
        System.out.println("Hello, " + x);
        System.out.println(x.reverse());
    }
}
