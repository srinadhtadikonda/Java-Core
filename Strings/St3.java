public class SortStrings {
    public static void main(String[] args) {
        String[] arr = {"Banana", "Apple", "Orange", "Mango", "Grapes"};
        String temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int k = 0;
                while (k < arr[i].length() && k < arr[j].length()) {
                    if (arr[i].charAt(k) > arr[j].charAt(k)) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    } else if (arr[i].charAt(k) < arr[j].charAt(k)) {
                        break;
                    }
                    k++;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
