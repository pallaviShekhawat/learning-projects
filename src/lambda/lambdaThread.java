package lambda;

public class lambdaThread {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Creating thread using lambda");
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
