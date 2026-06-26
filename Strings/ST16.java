public class WordCount {
    public static void main(String[] args) {
        String str = "I love Java programming";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Words = " + count);
    }
}
