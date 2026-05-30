package lambda;

public class MethodReferenceExp {
    public static void testShow(){
        System.out.println("Thread Running");
    }
}
 class Test{
    public static void main(String[] args) {
        Thread t1 = new Thread(MethodReferenceExp::testShow);
        Thread t2 = new Thread(MethodReferenceExp::testShow);
        t1.start();
        t2.start();
    }
}
