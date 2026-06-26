import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str);
        int count = st.countTokens();

        String[] arr = new String[count];

        int i = 0;
        StringTokenizer st2 = new StringTokenizer(str);
        while (st2.hasMoreTokens()) {
            arr[i] = st2.nextToken();
            i++;
        }

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Count Words");
            System.out.println("2. Ascending Order");
            System.out.println("3. Descending Order");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Convert to Uppercase");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Number of words = " + count);
                    break;

                case 2:
                    for (int x = 0; x < arr.length; x++) {
                        for (int y = x + 1; y < arr.length; y++) {
                            if (arr[x].charAt(0) > arr[y].charAt(0)) {
                                String temp = arr[x];
                                arr[x] = arr[y];
                                arr[y] = temp;
                            }
                        }
                    }

                    System.out.println("Ascending Order:");
                    for (i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    for (int x = 0; x < arr.length; x++) {
                        for (int y = x + 1; y < arr.length; y++) {
                            if (arr[x].charAt(0) < arr[y].charAt(0)) {
                                String temp = arr[x];
                                arr[x] = arr[y];
                                arr[y] = temp;
                            }
                        }
                    }

                    System.out.println("Descending Order:");
                    for (i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Lowercase:");
                    for (i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);

                        if (ch >= 'A' && ch <= 'Z') {
                            ch = (char)(ch + 32);
                        }
                        System.out.print(ch);
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Uppercase:");
                    for (i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);

                        if (ch >= 'a' && ch <= 'z') {
                            ch = (char)(ch - 32);
                        }
                        System.out.print(ch);
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);
    }
}
