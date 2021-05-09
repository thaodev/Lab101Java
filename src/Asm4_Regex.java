import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MyRegex {
    String zeroTo55 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d||25[0-5])";
    public String pattern = zeroTo55 + "\\." + zeroTo55 + "\\." + zeroTo55 + "\\." + zeroTo55;
}

public class Asm4_Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println("Enter your IP to check: ");
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

}
