import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;

public class CalendarPractice {
    static Calendar sc = Calendar.getInstance();
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toLowerCase();
        System.out.println(dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1).toLowerCase());
        createCalendar1();
        createCalendar2();
        createCalendar3();
    }
    public static void createCalendar1(){
        System.out.println("Calendar.DAY_OF_WEEK with setting days during the week");
        System.out.println(String.format("%-20s%-20s", "Date", "To-Do"));
        String[] array = {"Work for AC", "Learn to code", "Clean the house", "Water the plants",
        "Play with Martin", "Go to groceries", "gossip"};
        for (int i = SUNDAY; i <= SATURDAY; i++) {//SUNDAY equals to 1
            sc.set(Calendar.DAY_OF_WEEK, i);
            String dayOfWeek = sc.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
            System.out.println(String.format("%-20s%-20s", dayOfWeek, array[i-1]));
        }
        System.out.println("_______________________________");
    }
    public static void createCalendar2(){
        System.out.println("Calendar.DAY_OF_WEEK by default:");
        System.out.println(String.format("%-20s%-20s", "Date", "To-Do"));
        String dayOfWeek = sc.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        System.out.println(String.format("%-20s%-20s", dayOfWeek, "Learn to code"));
        System.out.println("--------------------------------");
    }
    public static void createCalendar3() {
        ArrayList<String> array = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            if (i%2 == 0) {
                array.add("Cold");
            }
            else {
                array.add("Hot");
            }
        }
        System.out.println(array.toString());
        for (int i = 0; i < 12; i++) {
            sc.set(Calendar.MONTH,i);
            String month = sc.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
            System.out.println(String.format("%-20s%-20s", month, array.get(i)));
        }

    }
}
