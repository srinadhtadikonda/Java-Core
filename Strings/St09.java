public class CharFrequency {
    public static void main(String[] args) {
        String str = "banana";
        boolean[] visited = new boolean[100];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) continue;

            char ch = str.charAt(i);
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}
