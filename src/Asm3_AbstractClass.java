import java.util.Scanner;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}
public class Asm3_AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook book = new MyBook();
        book.setTitle(title);
        System.out.println("The title is: " + book.getTitle());
    }
}
