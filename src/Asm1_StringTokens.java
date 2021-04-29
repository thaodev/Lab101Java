import java.io.*;
import java.util.*;
public class Asm1_StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.length() > 0){
            String[] arrayOfStrings = s.split("[!,?._'@\\s]+");
            System.out.println(arrayOfStrings.length);
            for(String str : arrayOfStrings) {
                System.out.println(str);
            }
        }else {
            System.out.println(0);
        }
        // Write your code here.
        scan.close();
    }
}



