import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String a = "anagramm";
        String b = "marganaa";
        boolean result = isAnagram(a, b);


    }
    static boolean isAnagram(String a, String b) {
        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for (int i = 0 ; i < arrayA.length; i++) {
            if (arrayA[i] == arrayB[i] && arrayA.length == arrayB.length) {
                System.out.println("Anagrams");
                return true;
            }

        }
        System.out.println("Not Anagrams");
        return false;

    }
}
