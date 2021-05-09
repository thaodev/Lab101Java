import java.util.ArrayList;
import java.util.Scanner;

class Teacher{};
class Rockstar{};
class Hacker{};
public class Asm3_Instanceof {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if(s.equals("Student")) myList.add(new Teacher());
            if(s.equals("Rockstar")) myList.add(new Rockstar());
            if(s.equals("Hacker")) myList.add(new Hacker());
        }
    }
}
