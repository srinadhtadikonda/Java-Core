import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 2, n;

        System.out.print("Enter a number: ");
        n = Integer.parseInt(br.readLine());

        if (n <= 1) {
            System.out.println("Not a Prime");
            return;
        }

        while (i <= n / 2) {
            if (n % i == 0) {
                System.out.println("Not a Prime");
                return;
            }
            i++;
        }

        System.out.println("Prime");
    }
}
