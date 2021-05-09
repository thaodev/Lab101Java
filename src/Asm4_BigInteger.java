import java.math.BigInteger;
import java.util.Scanner;

public class Asm4_BigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        System.out.println(a.add(sc.nextBigInteger()));
        System.out.println(a.multiply(sc.nextBigInteger()));


    }
}
