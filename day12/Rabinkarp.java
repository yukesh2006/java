package day12;

public class Rabinkarp {
    static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int base = 256;
        int prime = 101;
        int patternHash = 0;
        int textHash = 0;
        int h = 1;
        // Calculate h = base^(m-1) % prime
        for (int i = 0; i < m - 1; i++) {
            h = (h * base) % prime;
        }
        // Calculate initial hash values
        for (int i = 0; i < m; i++) {
            patternHash = (base * patternHash + pattern.charAt(i)) % prime;
            textHash = (base * textHash + text.charAt(i)) % prime;
        }
        // Slide pattern over text
        for (int i = 0; i <= n - m; i++) {
            // Hash values are same
            if (patternHash == textHash) {
                // Check characters
                int j;
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if (j == m) {
                    System.out.println("Pattern found at index " + i);
                }
            }
            // Calculate next window hash
            if (i < n - m) {
                textHash = (base * (textHash
                        - text.charAt(i) * h)
                        + text.charAt(i + m)) % prime;
                if (textHash < 0) {
                    textHash = textHash + prime;
                }
            }
        }
    }
    public static void main(String[] args) {
        String text = "ABCCDDAEFG";
        String pattern = "CDD";
        search(text, pattern);
    }
}