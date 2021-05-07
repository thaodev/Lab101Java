import java.util.Scanner;

public class Asm2_1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
