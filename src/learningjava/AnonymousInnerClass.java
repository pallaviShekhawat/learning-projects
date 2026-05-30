package learningjava;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is my Anonymous Inner Class");
            }
        });
        t.start();
    }
}
