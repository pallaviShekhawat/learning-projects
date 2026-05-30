package lambda;

@FunctionalInterface
interface Sayable{
    void Say();
}
public class MethodRefInterface {
    public static void saySomething(){
        System.out.println("Say something");
    }

    public static void main(String[] args) {
        Sayable say = MethodRefInterface::saySomething;
        say.Say();
    }
}
