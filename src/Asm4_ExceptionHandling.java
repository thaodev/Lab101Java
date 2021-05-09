import java.util.Scanner;

class MyCalculator {
    long power(int n, int p) throws Exception {
        if (n < 0  || p < 0)
            throw new Exception("n or p should not be negative.");
        else if (n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");
        else {
            int result = 1;
            for (int i = 1; i <= p ; i++) {
                result *= n;
            }
            return result;
        }
    }
}
public class Asm4_ExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(my_calculator.power(n,p));
            } catch (Exception etn) {
                System.out.println(etn);
            }
        }
    }
}
