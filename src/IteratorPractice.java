import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("I");
        array.add("try");
        array.add("to");
        array.add("learn");
        array.add("code");
        array.add("every");
        array.add("day");
        System.out.println(array);

        Iterator it = array.iterator();

        while(it.hasNext()) {//return true if it contain more elements
            String word = (String)it.next();
            if (word.length() % 2 ==0 ) {
                it.remove();
            }
            Object element = it.next();//return next elements of the collection the it is iterating over
            System.out.print(element + " ");
        }



    }
}
