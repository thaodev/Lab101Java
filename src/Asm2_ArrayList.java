import java.util.ArrayList;
import java.util.Scanner;

public class Asm2_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList[] array = new ArrayList[20000];
        for (int i = 0; i < n; i++) {
            array[i] = new ArrayList<>();
            int numberOfInteger = sc.nextInt();
            for (int j = 0; j < numberOfInteger; j++) {
                array[i].add(sc.nextInt());
            }
        }
        int numberOfQueries = sc.nextInt();

            for (int i = 0; i < numberOfQueries; i++) {
                int row = sc.nextInt();
                int col = sc.nextInt();
               try { System.out.println(array[row - 1].get(col - 1));
            } catch (IndexOutOfBoundsException e) {
                   System.out.println("ERROR!");
               }
        }

    }


}
