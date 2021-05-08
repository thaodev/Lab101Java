
class Arithmetic{
        int add(int x,int y){
        return x+y;
        }
}

class Adder extends Arithmetic {

}
public class Asm3_InheritanceII {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getName());//.getSuperclass());
        System.out.println(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10, 10) + "\n");
    }
}
