import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String a = "anagramm";
        String b = "marganaa";
        boolean result = isAnagram(a, b);


    }
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return  false;

        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for (int i = 0 ; i < arrayA.length; i++) {

            if ((arrayA[i] != arrayB[i])) {
                System.out.println("Not anagrams");
                return false;
            }
        }
        System.out.println("Anagrams");
        return true;

    }
}
