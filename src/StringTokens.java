import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();

        String[] arrayOfStrings = s.split("[ .,?!'_@]+");
        if (arrayOfStrings.length >= 1) {
            System.out.println(arrayOfStrings.length);
            for (String str : arrayOfStrings) {
                System.out.println(str);
            }
        }
        else {
            System.out.println(0);
        }

        scan.close();
    }
}
