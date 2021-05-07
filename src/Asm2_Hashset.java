import java.util.HashSet;
import java.util.Scanner;

public class Asm2_Hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the string pairs: ");
        int number = sc.nextInt();
        String[] left_pair = new String[number];
        String[] right_pair = new String[number];
        for (int i = 0; i < number; i++) {
            left_pair[i] = sc.next();
            right_pair[i] = sc.next();
        }
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < number; i++) {
            set.add(left_pair[i] + right_pair[i]);
            System.out.println(set.size());
        }

    }
}
