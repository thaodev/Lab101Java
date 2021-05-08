class BiCycle {
    String define_me() {
        return "a vehicle with pedals";
    }
}
class Motorcycle extends BiCycle {
    String define_me() {
        return "a cycle with an engine.";
    }
    Motorcycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}
public class Asm3_MethodOverriding2 {
    public static void main(String[] args) {
        Motorcycle M = new Motorcycle();
    }
}
