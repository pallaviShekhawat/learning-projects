package lambda;
class MyThread extends Thread {}
public class lambdaThreadt1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()+"running......"));
        t1.start();
    }
}
