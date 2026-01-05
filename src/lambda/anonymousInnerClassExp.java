package lambda;

//// Without Anonymous inner class example
//
//class MyRunnable implements Runnable{
//    public void run(){
//        System.out.println("Anonymous inner class example");
//    }
//}
//public class anonymousInnerClassExp {
//    public static void main(String[] args) {
//        MyRunnable m1 = new MyRunnable();
//        Thread t = new Thread(m1);
//        t.start();
//    }
//}


 // With Anonymous inner class

public class anonymousInnerClassExp {
 public static void main(String[] args) {
     Thread t = new Thread( new Runnable() {
         public void run(){
        System.out.println("Anonymous inner class example");
        }});
             t.start();
     }}