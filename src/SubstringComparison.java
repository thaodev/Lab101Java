import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        System.out.println("Input a string and an integer: ");
        Scanner input = new Scanner(System.in);
        String a =  input.nextLine();
        int k = input.nextInt();
        System.out.println(getSmallestAndLargest(a,k));
    }
    public static String getSmallestAndLargest(String a, int k) {
        String currentString = a.substring(0,k);
        String smallest = currentString;
        String largest = currentString;
        for (int i = 1; i <= a.length() - k ; i++) {
            currentString = a.substring(i, i + k);
            if(smallest.compareToIgnoreCase(currentString) > 0) {
                smallest = currentString;
            }
            if(largest.compareToIgnoreCase(currentString) < 0) {
                largest = currentString;
            }
        }
        return smallest + "\n" + largest;
    }
}
