public class AnagramsV2 {
    public static void main(String[] args) {
        String a = "anagramm";
        String b = "marganaa";
        boolean result = isAnagram(a, b);
        if (result) {
            System.out.println("Not Anagrams");
        }
        else {
            System.out.println("Anagrams");
        }
    }
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {

            return false;
        }
        a = a.toUpperCase();
        b = b.toUpperCase();

        int sum = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == c) {
                    sum++;
                }

                if (b.charAt(i) == c) {
                    sum--;
                }
            }

        }
        if (sum != 0) return false;
        return true;
    }
}
